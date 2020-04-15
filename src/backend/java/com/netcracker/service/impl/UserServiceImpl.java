package com.netcracker.service.impl;

import com.netcracker.entity.User;
import com.netcracker.repositories.TicketRepository;
import com.netcracker.repositories.UserRepository;
import com.netcracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return Optional.of(userRepository.findByUserName(login));
    }


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    public Long getPurchasedUserTicket(Long id) {
        return ticketRepository.countTicketsByUser_IdUser(id);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
