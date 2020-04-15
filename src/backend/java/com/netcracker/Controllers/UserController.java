package com.netcracker.Controllers;

import com.netcracker.entity.User;
import com.netcracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public ResponseEntity getUserByLogin(@PathVariable(name = "login") String login) {
        Optional<User> session = userService.findByLogin(login);
        return session.isPresent() ? ResponseEntity.ok(session.get()) :
                ResponseEntity.badRequest().body("invalid User login");
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/{idUser}/count", method = RequestMethod.GET)
    public Long countUsers(@PathVariable(name = "idUser") Long id) {
        return userService.getPurchasedUserTicket(id);
    }

}
