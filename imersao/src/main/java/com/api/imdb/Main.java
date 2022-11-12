package com.api.imdb;

import java.io.IOException;

import com.api.imdb.api.ConsumindoAPI;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        ConsumindoAPI api = new ConsumindoAPI();

        api.test(api.getAPI("https://imdb-api.com/en/API/Top250Movies/"));
    }
}
