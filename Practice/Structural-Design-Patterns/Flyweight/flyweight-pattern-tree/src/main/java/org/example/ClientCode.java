package org.example;

import org.example.flyweight.Forest;

import java.util.Random;

public class ClientCode {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 10; i++) {
            forest.plantTree(i, i, randomTreeName(), randomColor(), "Texture");
        }

        System.out.println("Tree-");
        forest.draw("canvas");
    }

    private static String randomColor() {
        String[] colors = {"Green", "Orange", "Yellow"};
        Random random = new Random();
        return colors[random.nextInt(3)];
    }

    private static String randomTreeName() {
        String[] names = {"Oak", "Flower", "YellowBee"};
        Random random = new Random();
        return names[random.nextInt(3)];
    }

}