package org.example.facade;

import org.example.facade.shape_impl.Circle;
import org.example.facade.shape_impl.Rectangle;
import org.example.facade.shape_impl.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
