package com.epam.web.mapper;

import com.epam.web.entity.Recipe;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeMapper implements Mapper<Recipe>{
    @Override
    public Recipe map(ResultSet resultSet) throws SQLException {
        long id = resultSet.getLong("id");
        Date requestdate = resultSet.getDate("requestdate");
        boolean status = resultSet.getBoolean("status");
        return new Recipe(id, requestdate, status);

    }
}
