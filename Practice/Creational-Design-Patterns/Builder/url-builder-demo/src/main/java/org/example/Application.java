package org.example;

import org.example.model.UrlBuilder;

public class Application {
    public static void main(String[] args) {
        System.out.println("-------------------Building URL with Url Builder-----------------------");
       var url = new UrlBuilder()
               .path("/v1/api")
               .port(":8081")
               .host("localhost")
               .params("?id=12")
               .protocol("http://")
               .build().getUrl();

        System.out.println(url);
    }
}