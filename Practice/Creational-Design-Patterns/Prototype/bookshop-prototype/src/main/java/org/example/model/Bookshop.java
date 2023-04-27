package org.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 03/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class Bookshop implements MyCloneable{

    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i = 0; i < 10; i++){
            Book b = new Book();
            b.setId(i);
            b.setName("Book " + i);
            getBooks().add(b);
        }
    }


    @Override
    public String toString() {
        return "Bookshop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public Bookshop clone() {
        Bookshop bookshop = new Bookshop();
        bookshop.setBooks(this.getBooks());
        bookshop.setShopName(this.getShopName());
        return bookshop;
    }
}
