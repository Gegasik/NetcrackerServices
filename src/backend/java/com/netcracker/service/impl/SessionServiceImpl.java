package com.netcracker.service.impl;

import com.netcracker.entity.Session;
import com.netcracker.repositories.SessionRepository;
import com.netcracker.repositories.TicketRepository;
import com.netcracker.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    SessionRepository sessionRepository;
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void delete(Long idSession) {
        sessionRepository.deleteById(idSession);
    }

    @Override
    public Session save(Session cinemaHall) {
        return sessionRepository.save(cinemaHall);
    }

    @Override
    public List<Session> getAll() {
        return (List<Session>) sessionRepository.findAll();
    }

    @Override
    public Optional<Session> getSessionById(Long id) {
        return sessionRepository.findById(id);
    }

    @Override
    public List<Session> findByFilmId(Long id) {
        List<Session> list = sessionRepository.findByFilm_IdFilm(id);
        return list;
    }

    @Override
    public Long getPurchasedSessionTicket(Long idSession) {
        return ticketRepository.countTicketsBySession_IdSession(idSession);
    }

    @Override
    public List<Session> findByDate(Long date) {
        Timestamp timestamp = new Timestamp(date);
       return sessionRepository.findByDateAfter(timestamp);
    }
}
