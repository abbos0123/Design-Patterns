package org.example;

public class ClientApplication {
    public static void main(String[] args) {
        CompoundGraphic graphic = new CompoundGraphic();
        graphic.addGraphic(new Dot(1, 2));
        graphic.addGraphic(new Circle(4, 5,5));

        CompoundGraphic root = new CompoundGraphic();
        root.addGraphic(graphic);
        root.addGraphic(new Circle(3, 4, 4));

        root.draw();
    }
}