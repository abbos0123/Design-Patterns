package org.example.facade.shape_impl;

import org.example.facade.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawing !");
    }
}
