package com.epam.web.dao;

import com.epam.web.connection.ProxyConnection;
import com.epam.web.entity.Entity;
import com.epam.web.mapper.Mapper;

public abstract class AbstractDao<T extends Entity> implements Dao<T>{

    private final ProxyConnection connection;
    private final Mapper<T> mapper;
    private final String tableName;


    protected AbstractDao(ProxyConnection connection, Mapper<T> mapper, String tableName) {
        this.connection = connection;
        this.mapper = mapper;
        this.tableName = tableName;
    }
}
