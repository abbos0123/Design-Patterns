package org.example.decorator;

public class Application {

    public static void shapeMethod() {
        Shape circle = new Circle();
        workingWithShape(circle);

        Shape redShapedCircle = new RedShapeDecorator(circle);
        workingWithShape(redShapedCircle);

        Shape redShapedRectangle = new RedShapeDecorator(new Rectangle());
        workingWithShape(redShapedRectangle);

        Shape rectangle = new Rectangle();
        workingWithShape(rectangle);
    }


    public static void workingWithShape(Shape shape) {
        shape.draw();
        System.out.println();
    }

}
