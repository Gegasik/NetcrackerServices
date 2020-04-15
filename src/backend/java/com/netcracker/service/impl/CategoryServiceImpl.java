package com.netcracker.service.impl;

import com.netcracker.entity.Category;
import com.netcracker.repositories.CategoryRepository;
import com.netcracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long idCategory) {
        categoryRepository.deleteById(idCategory);
    }

    @Override
    public Optional<Category> getCategory(Long idCategory) {
        return categoryRepository.findById(idCategory);
    }

    @Override
    public List<Category> getAll() {
        return (List<Category>) categoryRepository.findAll();
    }


}
