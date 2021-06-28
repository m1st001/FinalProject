package com.epam.web.dao;

import com.epam.web.connection.ProxyConnection;
import com.epam.web.entity.Product;
import com.epam.web.mapper.ProductMapper;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ProductDao extends AbstractDao<Product>{
    private static final String TABLE_NAME = "product";
    private static final String CREATE = "insert into product " +
            "(id, productname, price, recipe) values (?, ?, ?, ?)";
    private static final String UPDATE = "update product " +
            "set productname = ?, price = ?, recipe = ? where id = ?";

    public ProductDao(ProxyConnection connection){
        super(connection,new ProductMapper(), TABLE_NAME);
    }
    @Override
    protected void create(Product product) throws DaoException {
        executeUpdate(CREATE, product.getProductname(), product.getPrice(), product.isRecipe());
    }

    @Override
    protected void update(Product product) throws DaoException {

        Optional<Product> optionalProduct = findById(product.getId());
        executeUpdate(UPDATE, product.isRecipe(),product.getProductname(),product.getPrice(),product.getId());
    }
}
