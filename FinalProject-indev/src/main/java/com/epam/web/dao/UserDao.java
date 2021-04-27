package com.epam.web.dao;

import com.epam.web.connection.ProxyConnection;
import com.epam.web.entity.User;
import com.epam.web.mapper.UserMapper;

import java.util.Optional;

public class UserDao extends AbstractDao<User> {
    public static final String TABLE_NAME = "user";

    public UserDao(ProxyConnection connection) {
        super(connection, new UserMapper(), TABLE_NAME);
    }

    @Override
    protected void create(User user) throws DaoException {
        executeUpdate(CREATE, user.getUsername(), user.getPassword(), user.getRole().toString());
    }

    @Override
    protected void update(User user) throws DaoException {

        Optional<User> optionalUser = findById(user.getId());

        if (!optionalUser.isPresent()) {
            throw new DaoException("User doesn't exist in table. Id is invalid: " + user.getId());
        }

        executeUpdate(UPDATE, user.getUsername(), user.getPassword(), user.getRole().toString(), user.getId());
    }
}

