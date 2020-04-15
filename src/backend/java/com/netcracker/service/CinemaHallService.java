package com.netcracker.service;

import com.netcracker.entity.CinemaHall;

import java.util.List;
import java.util.Optional;

public interface CinemaHallService {
    void delete(Long idHall);

    CinemaHall save(CinemaHall cinemaHall);

    List<CinemaHall> getAll();

    Optional<CinemaHall> getCinemaHallById(Long id);
}
