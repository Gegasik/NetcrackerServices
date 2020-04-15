package com.netcracker.repositories;

import com.netcracker.entity.Category;
import com.netcracker.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
List findFilmsByFilmNameContains(String name);
List findFilmsByCategoriesContains(Category category);
}
