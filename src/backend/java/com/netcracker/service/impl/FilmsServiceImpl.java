package com.netcracker.service.impl;

import com.netcracker.entity.Film;
import com.netcracker.repositories.CategoryRepository;
import com.netcracker.repositories.FilmRepository;
import com.netcracker.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FilmsServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Film> findAll(String name) {
        if (name == null) {
            return (List) filmRepository.findAll();
        } else {
            return filmRepository.findFilmsByFilmNameContains(name);
        }
    }

    public List<Film> findFilmByCategory(Long idCategory) {
        return filmRepository.findFilmsByCategoriesContains(categoryRepository.findById(idCategory).get());

    }

    @Override
    public Optional<Film> getFilm(Long id) {
        return filmRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public Film save(Film film) {
        return filmRepository.save(film);
    }
}
