package com.netcracker.service;

import com.netcracker.entity.Category;
import com.netcracker.entity.Film;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface FilmService {
    List<Film> findAll(String name);
    List<Film> findFilmByCategory(Long idCategory);

    Optional<Film> getFilm(Long id);

    void delete(Long id);

    Film save(Film film);

}
