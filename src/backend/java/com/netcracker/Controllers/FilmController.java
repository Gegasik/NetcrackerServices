package com.netcracker.Controllers;

import com.netcracker.entity.Film;
import com.netcracker.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    //посмотреть список доступных фильмов
    @RequestMapping(value = "/{filmId}", method = RequestMethod.GET)
    public ResponseEntity getFilmById(@PathVariable(name = "filmId") Long id) {
        Optional<Film> film = filmService.getFilm(id);
        return film.isPresent() ? ResponseEntity.ok(film.get()) :
                ResponseEntity.badRequest().body("invalid film Id");
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Film> findAllFilms(@RequestParam(value = "search", required = false) String name) {
        return filmService.findAll(name);
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<Film> findAllFilmsByCategory(@RequestParam(value = "category", required = false) Long idCategory) {
        return filmService.findFilmByCategory(idCategory);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Film saveFilm(@RequestBody Film film) {
        return filmService.save(film);
    }

    //TODO не все фильмы могут удалятся
    @RequestMapping(value = "/{filmId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "filmId") Long id) {
        filmService.delete(id);
    }


}