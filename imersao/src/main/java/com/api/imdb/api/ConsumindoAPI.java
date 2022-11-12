package com.api.imdb.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConsumindoAPI {

    private ObjectMapper mapper;

    public ConsumindoAPI() {
        this.mapper = new ObjectMapper();
    }

    public String getAPI(String url) {

        Properties prop = getProp();

        URI uri = URI.create(url.concat(prop.getProperty("key")));
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            System.out.println(response.body());
            String body = response.body();

            return body;

        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public Properties getProp() {
        Properties prop = new Properties();
        FileInputStream file;
        try {

            file = new FileInputStream("./project.properties");
            prop.load(file);
            return prop;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;

    }

    public List<Map<String, String>> test(String json) throws IOException {

        Map<String, String> myMap = new HashMap<>();

        List<Map<String, String>> dados = new ArrayList<>();

        String[] items = mapper.readValue(json, String[].class);

        for (String string : items) {

            System.out.println(string);

        }

        return dados;
    }

}
