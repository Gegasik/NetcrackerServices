package com.nc.service;

import com.nc.models.CinemaHall;

import java.util.List;
import java.util.Optional;

public interface CinemaHallService {
    void delete(Long idHall);

    CinemaHall save(CinemaHall cinemaHall);

    List<CinemaHall> getAll();
}
