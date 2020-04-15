package com.nc.Controllers;

import com.nc.models.Category;
import com.nc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
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
