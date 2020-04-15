package com.netcracker.service;

import com.netcracker.entity.Category;

import java.util.List;
import java.util.Optional;


public interface CategoryService {
    Category save(Category category);

    void delete(Long idCategory);

    Optional<Category> getCategory(Long idCategory);

    List<Category> getAll();
}
