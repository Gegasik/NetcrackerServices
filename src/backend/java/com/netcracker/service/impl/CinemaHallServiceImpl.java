package com.netcracker.service.impl;

import com.netcracker.entity.CinemaHall;
import com.netcracker.repositories.CinemaHallRepository;
import com.netcracker.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    @Override
    public void delete(Long idHall) {
        cinemaHallRepository.deleteById(idHall);
    }

    @Override
    public CinemaHall save(CinemaHall cinemaHall) {
        return cinemaHallRepository.save(cinemaHall);
    }

    @Override
    public List<CinemaHall> getAll() {
        return (List<CinemaHall>) cinemaHallRepository.findAll();
    }

    @Override
    public Optional<CinemaHall> getCinemaHallById(Long id) {
        return cinemaHallRepository.findById(id);
    }
}
