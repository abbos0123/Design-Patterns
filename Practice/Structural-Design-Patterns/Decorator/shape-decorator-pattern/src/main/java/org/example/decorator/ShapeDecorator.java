package org.example.decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    public void draw(){
        shapeDecorator.draw();
    }
}
