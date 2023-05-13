package org.example.decorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Border with color Red ");
    }
}
