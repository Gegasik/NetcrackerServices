package com.nc.Controllers;

import com.nc.models.Film;
import com.nc.service.impl.FilmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmsServiceImpl filmService;

    @RequestMapping(value = "/{filmId}", method = RequestMethod.GET)
    public ResponseEntity<Film> getFilmById(@PathVariable(name = "filmId") Long id) {
        Film film = filmService.getFilm(id).get();
        return ResponseEntity.ok(film);
    }

    //посмотреть список доступных фильмов
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Film> getAllFilms(@RequestParam(value = "search", required = false) String name) {
        return filmService.findAll(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Film saveFilm(@RequestBody Film film) {
        return filmService.save(film);
    }

    ////TODO не все фильмы могут удалятся
    @RequestMapping(value = "/{filmId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "filmId") Long id) {
        filmService.delete(id);
    }

}