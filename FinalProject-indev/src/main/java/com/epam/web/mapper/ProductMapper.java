package com.epam.web.mapper;

import com.epam.web.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements Mapper<Product> {

    @Override
    public Product map(ResultSet resultSet) throws SQLException{
        long id = resultSet.getLong("id");
        String productname = resultSet.getString("productname");
        int price = resultSet.getInt("price");
        boolean recipe = resultSet.getBoolean("recipe");
        return new Product(id,productname,price,recipe);
    }
}
