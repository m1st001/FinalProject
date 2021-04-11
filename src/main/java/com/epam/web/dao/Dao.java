package com.epam.web.dao;

import com.epam.web.entity.Entity;
import java.util.List;
import java.util.Optional;

public interface Dao<T extends Entity> {
    Optional<T> findById(long id) throws Exception;
    //Custom exception needed//
    List<T> getAll() throws Exception;
    void save(T entity) throws Exception;
    void delete(T entity) throws Exception;

}
