package com.netcracker.Controllers;

import com.netcracker.entity.Category;
import com.netcracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }


    @RequestMapping(value = "/{categoryId}", method = RequestMethod.GET)
    public ResponseEntity getCategory(@PathVariable(value = "categoryId") Long id) {
        Optional<Category> category = categoryService.getCategory(id);
        return category.isPresent() ? ResponseEntity.ok(category.get()) :
                ResponseEntity.badRequest().body("invalid category Id");

    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.getAll();
    }


    @RequestMapping(value = "/{categoryId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "categoryId") Long id) {
        categoryService.delete(id);
    }
}
