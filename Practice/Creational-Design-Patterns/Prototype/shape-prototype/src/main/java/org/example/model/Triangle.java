package org.example.model;

/**
 * Author: Abbos Fayziboev
 * Date: 03/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class Triangle implements Shape {
    private float sideA, sideB, sideC;

    private Triangle(){
    }

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Shape clone() {
        Triangle triangle = new Triangle();
        triangle.sideA = this.sideA;
        triangle.sideB = this.sideB;
        triangle.sideC = this.sideC;
        return triangle;
    }

    @Override
    public String name() {
        return "Triangle";
    }

    @Override
    public Double surface() {
        return -1d;
    }
}
