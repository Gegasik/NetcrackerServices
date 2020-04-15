package com.nc.service.impl;

import com.nc.models.CinemaHall;
import com.nc.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public void delete(Long idHall) {
        RestTemplate restTemplate= new RestTemplate();
        restTemplate.delete(backendServerUrl+"/cinemaHall/"+idHall);
    }

    @Override
    public CinemaHall save(CinemaHall cinemaHall) {
        RestTemplate restTemplate= new RestTemplate();
        return restTemplate.postForObject(backendServerUrl+"/cinemaHall",cinemaHall,CinemaHall.class);
    }

    @Override
    public List<CinemaHall> getAll() {
        RestTemplate restTemplate= new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/cinemaHall",List.class);
    }

}
