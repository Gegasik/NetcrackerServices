package com.netcracker.repositories;

import com.netcracker.entity.Category;
import com.netcracker.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
