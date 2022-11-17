package com.imersaojava;

import java.io.IOException;
import java.util.Scanner;

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
        System.out.println("\u2764");

    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        String f;
        do {
            System.out.println("Deseja dar uma nova avaliação?");
            System.out.println("S : N");
            f = sc.next();
        } while (f.equals("S") || f.equals("N"));

        if (f.equals("S")) {
            System.out.println("Insira a sua nota: ");
            f = sc.next();

            if (f.contains(".")) {

            }
        }

        sc.close();

    }
}
