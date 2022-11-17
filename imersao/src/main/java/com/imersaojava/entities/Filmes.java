package com.imersaojava.entities;

import java.util.ArrayList;
import java.util.List;

import com.imersaojava.tools.ANSI;

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
            System.out.println(ANSI.HIGH_INTENSITY);
            System.out.println(filme.getRank());
            System.out.println(ANSI.RED + filme.getTitle() + ANSI.SANE);
            System.out.println(ANSI.CYAN + filme.getYear() + ANSI.SANE);
            System.out.println(filme.getRating());
            System.out.println(ANSI.GREEN + filme.getImage() + ANSI.SANE);
            System.out.println(ANSI.SANE);
        }
    }

}
