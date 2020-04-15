package com.netcracker.service;


import com.netcracker.entity.Session;

import java.util.List;
import java.util.Optional;

public interface SessionService {
    void delete(Long idSession);

    Session save(Session cinemaHall);

    List<Session> getAll();

    Optional<Session> getSessionById(Long id);

    List<Session> findByFilmId(Long filmId);

    Long getPurchasedSessionTicket(Long idSession);

    List<Session> findByDate(Long date);

}
