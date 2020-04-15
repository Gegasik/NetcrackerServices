package com.nc.models;

import java.util.HashSet;
import java.util.Set;

public class User {
    public User() {
    }

    private Long idUser;

    private String userName;

    private String userEmail;

    private String password;


    //@JsonManagedReference
    Set<Session> sessions = new HashSet<>();

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> subscriptions) {
        this.sessions = subscriptions;
    }
}
