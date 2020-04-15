package com.nc.service.impl;

import com.nc.models.Film;
import com.nc.service.FilmService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class FilmsServiceImpl implements FilmService {
    @Value("${backend.server.url}api/")
    private String backendServerUrl;

    //    @Override
    public List findAll(String name) {
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap> films;
        if (name == null) {
            films = restTemplate.getForObject(backendServerUrl + "/films", List.class);
        } else {
            Map<String, String> urlVariables = new HashMap<String, String>();
            urlVariables.put("name", name);
            films = restTemplate.getForObject(backendServerUrl + "/films", List.class, urlVariables);
        }
        return films;
    }

    @Override
    public Optional<Film> getFilm(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return Optional.of(restTemplate.getForObject(backendServerUrl + "/films/" + id, Film.class));
    }

    @Override
    public void delete(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/films/" + id);
    }

    @Override
    public Film save(Film film) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(backendServerUrl + "/films", film, Film.class);
    }

    @Override
    public List findAllByCategory(Long idCategory) {
        RestTemplate restTemplate = new RestTemplate();
        List films;
        if (idCategory == null) {
            films = restTemplate.getForObject(backendServerUrl + "/films", List.class);
        } else {
            Map<String, Long> urlVariables = new HashMap<String, Long>();
            urlVariables.put("name", idCategory);
            films = restTemplate.getForObject(backendServerUrl + "/films", List.class, urlVariables);
        }
        return films;
    }


}
