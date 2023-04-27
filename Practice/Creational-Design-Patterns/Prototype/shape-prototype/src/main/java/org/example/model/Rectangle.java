package org.example.model;

/**
 * Author: Abbos Fayziboev
 * Date: 03/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class Rectangle implements Shape{
    private float length;
    private float breadth;

    public Rectangle(){}
    public Rectangle(float length, float breadth){
        this.breadth=breadth;
        this.length=length;
    }

    @Override
    public Shape clone() {
        Rectangle cloned = new Rectangle();
        cloned.length= this.length;
        cloned.breadth=this.breadth;
        return cloned;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public Double surface() {
        return (double) (breadth * length);
    }

}
