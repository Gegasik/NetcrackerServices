package com.nc.service;

import com.nc.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findByLogin(String login);

    User save(User user);

    void delete(long id);

    Long getPurchasedUserTicket(Long idUser);
}
