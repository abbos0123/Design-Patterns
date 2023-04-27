package org.example.model;

public abstract class Fruit {
    public String name;
    public String color;
    public Long price;

    public Fruit(String name, String color, Long price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public abstract void showVitamins();

    public abstract void description();

}
