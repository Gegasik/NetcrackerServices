package com.nc.models;


import java.sql.Timestamp;
import java.util.Set;

public class Session {
    private Long idSession;
    //@JsonBackReference
    private Film film;
    //@JsonManagedReference
    private CinemaHall cinemaHall;
    //@JsonBackReference
    private Set<User> users;
    private Timestamp timestamp;

    public Session() {
    }

    public Long getIdSession() {
        return idSession;
    }

    public void setIdSession(Long idSession) {
        this.idSession = idSession;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
