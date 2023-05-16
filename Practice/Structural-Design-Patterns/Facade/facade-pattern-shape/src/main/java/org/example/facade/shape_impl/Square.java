package org.example.facade.shape_impl;

import org.example.facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square drawing !");
    }
}
