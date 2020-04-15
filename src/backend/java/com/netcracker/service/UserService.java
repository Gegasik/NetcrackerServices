package com.netcracker.service;

import com.netcracker.entity.Session;
import com.netcracker.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByLogin(String login);

    User save(User user);

    Long getPurchasedUserTicket(Long idUser);

    void delete(long id);
}
