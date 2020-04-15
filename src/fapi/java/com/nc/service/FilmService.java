package com.nc.service;

import com.nc.models.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<Film> findAll(String name);

    Optional<Film> getFilm(Long id);

    void delete(Long id);

    List findAllByCategory(Long idCategory);

    Film save(Film film);
}
