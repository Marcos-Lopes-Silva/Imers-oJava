package com.api.imdb;

import java.util.Properties;

import com.api.imdb.api.ConsumindoAPI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ConsumindoAPI api = new ConsumindoAPI();

        Properties prop = api.getProp();

        String prop1 = prop.getProperty("key");

        System.out.println(prop1);

        
        api.getAPI("https://imdb-api.com/en/API/Top250Movies/");
    }
}
