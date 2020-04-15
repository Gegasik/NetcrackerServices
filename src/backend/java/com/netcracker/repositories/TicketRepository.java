package com.netcracker.repositories;

import com.netcracker.entity.Session;
import com.netcracker.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Long>{
    Long countTicketsBySession_IdSession(Long idSession);
    Long countTicketsByUser_IdUser(Long IdUser);
}
