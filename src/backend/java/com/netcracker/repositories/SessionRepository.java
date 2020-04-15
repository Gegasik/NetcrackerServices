package com.netcracker.repositories;

import com.netcracker.entity.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface SessionRepository extends CrudRepository<Session, Long> {
    List<Session> findByFilm_IdFilm(Long idFilm);

    List<Session> findByDateAfter(Timestamp date);
}
