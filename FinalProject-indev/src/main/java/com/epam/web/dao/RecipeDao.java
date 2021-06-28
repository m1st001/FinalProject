package com.epam.web.dao;

import com.epam.web.entity.Recipe;

public class RecipeDao  extends AbstractDao<Recipe>{
    public static final String TABLE_NAME = "recipe";
    public static final String CREATE = "insert into recipe (product_id) values (?)";
    private static final String UPDATE = "update recipe set  = ? where id = ?";
}
