package com.nc.service.impl;

import com.nc.models.Session;
import com.nc.service.SessionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class SessionServiceImpl implements SessionService {
    @Value("${backend.server.url}api/")
    private String backendServerUrl;

    @Override
    public void delete(Long idSession) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/sessionFilm");
    }

    @Override
    public Session save(Session cinemaHall) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(backendServerUrl + "/sessions", cinemaHall, Session.class);
    }

    @Override
    public List getAll(String date) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/sessions", List.class);

    }

    public Long getCountPurchasedSessionTicker(Long idSession) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/" + idSession + "/count", Long.class);
    }

    @Override
    public Optional<Session> getSessionById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return Optional.of(restTemplate.getForObject(backendServerUrl + "/sessions/" + id, Session.class));
    }

    @Override
    public List<Session> findByFilmId(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/sessions/film/" + id, List.class);
    }

    @Override
    public List<Session> findByDate(Long date) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/sessions/date/" + date, List.class);
    }

}
