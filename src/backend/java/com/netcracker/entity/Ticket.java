package com.netcracker.entity;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    Long id;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "id_session")
    Session session;

    public Ticket() {
    }
}
