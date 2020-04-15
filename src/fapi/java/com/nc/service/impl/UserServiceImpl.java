package com.nc.service.impl;

import com.nc.models.User;
import com.nc.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Value("${backend.server.url}api/")
    private String backendServerUrl;

    @Override
    public List<User> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "users", List.class);
    }
    public Long getPurchasedUserTicket(Long id){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "users/"+id+"/count", Long.class);
    }

    @Override
    public Optional<User> findByLogin(String login) {
        RestTemplate restTemplate = new RestTemplate();
        return Optional.of(restTemplate.getForObject(backendServerUrl + "users/"+login,User.class));
    }

    @Override
    public User save(User user) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(backendServerUrl+"users",user,User.class);
    }



    @Override
    public void delete(long id) {

    }
}
