
package com.nc.service;

import com.nc.models.Session;

import java.util.List;
import java.util.Optional;

public interface SessionService {
    void delete(Long idSession);

    Session save(Session cinemaHall);

    List<Session> getAll(String date);

    Optional<Session> getSessionById(Long id);

    List<Session> findByFilmId(Long filmId);

    Long getCountPurchasedSessionTicker(Long idSession);

    List<Session> findByDate(Long date);
}
