package com.nc.models;

import java.util.HashSet;
import java.util.Set;

public class Film {
    public Film() {
    }

    private long idFilm;

    private String filmName;

    private String filmDescriptions;

    //@JsonManagedReference
    private Set<Session> sessions;
    //@JsonManagedReference
    private Set<Category> categories = new HashSet<>();


    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmDescriptions() {
        return filmDescriptions;
    }

    public void setFilmDescriptions(String filmDescriptions) {
        this.filmDescriptions = filmDescriptions;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions_films) {
        this.sessions = sessions_films;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
