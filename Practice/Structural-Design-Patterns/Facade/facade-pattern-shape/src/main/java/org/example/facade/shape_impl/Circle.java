package org.example.facade.shape_impl;

import org.example.facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle drawing!");
    }
}
