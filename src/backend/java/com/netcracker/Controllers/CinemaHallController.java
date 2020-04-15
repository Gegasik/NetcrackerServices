package com.netcracker.Controllers;

import com.netcracker.entity.CinemaHall;
import com.netcracker.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/cinemaHalls")
public class CinemaHallController {
    @Autowired
    CinemaHallService cinemaHallService;

    @RequestMapping(method = RequestMethod.POST)
    public CinemaHall save(@RequestBody CinemaHall cinemaHall) {
        return cinemaHallService.save(cinemaHall);
    }

    @RequestMapping(value = "/{cinemaHallId}", method = RequestMethod.GET)
    public ResponseEntity getCinemaHall(@PathVariable(value = "cinemaHallId") Long id) {
        Optional<CinemaHall> CinemaHall = cinemaHallService.getCinemaHallById(id);
        return CinemaHall.isPresent() ? ResponseEntity.ok(CinemaHall.get()) :
                ResponseEntity.badRequest().body("invalid cinemaHall Id");
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
