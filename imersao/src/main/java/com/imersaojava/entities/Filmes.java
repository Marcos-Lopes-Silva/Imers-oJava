package com.imersaojava.entities;

import java.util.ArrayList;
import java.util.List;

public class Filmes {

    private List<Filme> filmes;

    public Filmes() {
        filmes = new ArrayList<>();
    }

    public void add(Filme filme) {
        filmes.add(filme);
    }

    public void print() {
        for (Filme filme : filmes) {
            System.out.println(filme.getTitle());
            System.out.println(filme.getYear());
            System.out.println(filme.getRating());
            System.out.println(filme.getImage());
        }
    }

}
