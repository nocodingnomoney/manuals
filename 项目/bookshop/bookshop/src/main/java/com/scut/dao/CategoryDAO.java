package com.scut.dao;

import java.util.List;

import com.scut.entity.Category;

public interface CategoryDAO {

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);

    List<Category> list();

    int count();

}
