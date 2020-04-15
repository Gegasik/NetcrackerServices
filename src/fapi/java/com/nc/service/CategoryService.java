package com.nc.service;


import com.nc.models.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);

    void delete(Long idCategory);

    List<Category> getAll();

}
