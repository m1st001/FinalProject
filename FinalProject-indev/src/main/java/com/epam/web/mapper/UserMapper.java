package com.epam.web.mapper;

import com.epam.web.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements Mapper<User> {

    @Override
    public User map(ResultSet resultSet) throws SQLException{
        long id = resultSet.getLong("id");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        String role = resultSet.getString("role");
        return new User(id,username,password,role);
    }
}
