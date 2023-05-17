package org.example.flyweight;

import java.util.HashMap;
import java.util.SplittableRandom;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Circle with color " + color + " is created!");
        }

        return circle;
    }
}
