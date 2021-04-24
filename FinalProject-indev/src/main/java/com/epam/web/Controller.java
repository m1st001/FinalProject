package com.epam.web;

import com.epam.web.command.Command;
import com.epam.web.command.CommandFactory;
import com.epam.web.command.CommandResult;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private final CommandFactory commandFactory = new CommandFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String commandType = request.getParameter("command");
        Command command = commandFactory.create(commandType);

        try {
            CommandResult commandResult = command.execute(request, response);
            String page = commandResult.getPage();
            boolean redirect = commandResult.isRedirect();

            if (redirect) {
                response.sendRedirect(page);
            } else {
                request.getRequestDispatcher(page).forward(request, response);
            }

        } catch (ServiceException e) {
            // ...
        }
    }

    private void saveParams(HttpServletRequest request) {
        String query = request.getQueryString();
        request.getSession().setAttribute("previousParams", query);
    }



}
