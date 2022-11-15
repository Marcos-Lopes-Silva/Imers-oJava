package com.imersaojava;

import java.io.IOException;

import com.imersaojava.api.ConsumindoAPI;
import com.imersaojava.entities.Filmes;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        ConsumindoAPI api = new ConsumindoAPI();

        Filmes filmes = api.getFilmes250("https://imdb-api.com/en/API/Top250Movies/");

        filmes.print();
    }
}
