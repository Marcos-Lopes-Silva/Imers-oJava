package com.api.imdb.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Properties;

public class ConsumindoAPI {
    
    public void getAPI(String url){

        Properties prop = getProp();


        URI uri = URI.create(url.concat(prop.getProperty("key")));
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();


        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    public Properties getProp(){
        Properties prop = new Properties();
        FileInputStream file;
        try{

        file = new FileInputStream("./project.properties");
        prop.load(file);
        return prop;

        }catch(IOException e){
            e.printStackTrace();
        }

        return prop;
    
    }

}
