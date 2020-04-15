package com.nc.models;


import java.util.HashSet;
import java.util.Set;

public class Category {
    public Category() {
    }

    private long idCategory;
    private String nameCategory;
    //@JsonBackReference
    private Set<Film> films = new HashSet<>();

    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
