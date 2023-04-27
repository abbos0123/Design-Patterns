package org.example;

import org.example.factory.Factory;
import org.example.factory.FruitFactory;
import org.example.factory.FruitFactory2;
import org.example.model.Fruit;

public class Main {
    public static void main(String[] args) {
        String name = args[0];
        Factory factory;
        Fruit fruit;
        factory = new FruitFactory2();
        fruit = factory.createFruit(name);
        BusinessApplication.provideData(fruit);
    }
}