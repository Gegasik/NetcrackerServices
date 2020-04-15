package com.netcracker.repositories;

import com.netcracker.entity.Session;
import com.netcracker.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String login);

}
