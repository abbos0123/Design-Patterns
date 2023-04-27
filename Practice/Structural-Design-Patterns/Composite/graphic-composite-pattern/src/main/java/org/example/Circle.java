package org.example;

public class Circle extends Dot{
    private int radius;

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("I am drawing circle at (%d : %d)\n", super.x, super.y);
    }
}
