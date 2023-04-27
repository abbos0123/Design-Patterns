package org.example;

import org.example.model.Bookshop;

public class Application {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop();

        bookshop.setShopName("Novelty");
        bookshop.loadData();
        System.out.println(bookshop);

        Bookshop bookshop1 = bookshop.clone();
        bookshop1.setShopName("Novelty 2");
        System.out.println(bookshop1);

    }
}