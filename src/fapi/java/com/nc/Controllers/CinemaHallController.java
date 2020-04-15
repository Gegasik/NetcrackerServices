package com.nc.Controllers;

import com.nc.models.CinemaHall;
import com.nc.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cinemaHall")
public class CinemaHallController {
    @Autowired
    CinemaHallService cinemaHallService;

    @RequestMapping(method = RequestMethod.POST)
    public CinemaHall save(@RequestBody CinemaHall cinemaHall) {
        return cinemaHallService.save(cinemaHall);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<CinemaHall> getAll() {
        return cinemaHallService.getAll();
    }

    @RequestMapping(value = "/{cinemaHallId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "cinemaHallId") Long id) {
        cinemaHallService.delete(id);
    }
}
