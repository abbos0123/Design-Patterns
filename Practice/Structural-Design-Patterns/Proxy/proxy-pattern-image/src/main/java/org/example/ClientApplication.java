package org.example;

import org.example.proxy.Image;
import org.example.proxy.ProxyImage;

public class ClientApplication {
    public static void main(String[] args) {
        Image image = new ProxyImage("test+10mb.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}