package org.example;

import org.example.model.Rectangle;
import org.example.model.Shape;
import org.example.model.Triangle;

public class Application {
    public static void main(String[] args) {

        System.out.println("-----------------Triangle----------------");
        Shape triangle = new Triangle(10, 12, 20);
        System.out.println("NAME    : " + triangle.name());
        System.out.println("SURFACE : " + triangle.surface());

        System.out.println("-------------Triangle Cloned------------");
        Shape triangleCloned = triangle.clone();
        System.out.println("NAME    : " + triangleCloned.name());
        System.out.println("SURFACE : " + triangle.surface());

        System.out.println("-------------Rectangle------------------");
        Shape rectangle = new Rectangle(12f, 20);
        System.out.println("NAME    : " + rectangle.name());
        System.out.println("SURFACE : " + rectangle.surface());

        System.out.println("-----------Rectangle Cloned-------------");
        Shape rectangleCloned = rectangle.clone();
        System.out.println("NAME    : " + rectangleCloned.name());
        System.out.println("SURFACE : " + rectangleCloned.surface());
    }
}