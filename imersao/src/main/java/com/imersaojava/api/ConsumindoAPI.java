package com.imersaojava.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.imersaojava.entities.Filme;
import com.imersaojava.entities.Filmes;

public class ConsumindoAPI {

    private ObjectMapper mapper;

    public ConsumindoAPI() {
        this.mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static String getAPI(String url) {

        Properties prop = getProp();

        URI uri = URI.create(url.concat(prop.getProperty("key")));
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            String body = response.body();
            // System.out.println(body);
            return body;

        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public static Properties getProp() {
        Properties prop = new Properties();
        FileInputStream file;
        try {

            file = new FileInputStream("./config.properties");
            prop.load(file);
            return prop;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;

    }

    public List<Map<String, String>> parser(String json) throws IOException {

        List<Map<String, String>> dados = new ArrayList<>();

        JsonNode rootNode = mapper.readTree(json);
        JsonNode items = rootNode.path("items");

        String itemsList = items.toString();

        dados = mapper.readValue(itemsList, new TypeReference<List<Map<String, String>>>() {

        });

        return dados;
    }

    public Filmes getFilmes250(String url) throws IOException {
        Filmes filmes = new Filmes();
        url = getAPI(url);
        List<Map<String, String>> map = parser(url);
        // System.out.println(map.get(0));

        for (Map<String, String> map2 : map) {
            String title = map2.get("title");
            String rank = map2.get("rank");
            String year = map2.get("year");
            String rating = map2.get("imDbRating");
            String image = map2.get("image");
            Filme filme = new Filme(title, rank, year, image, rating);
            filmes.add(filme);
        }

        return filmes;
    }

}
