package org.example.model;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class RealItem implements Item{
    private String name;
    private String description;
    private int height;

    public RealItem(String name, String description, int height) {
        this.name = name;
        this.description = description;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getText() {
        return description;
    }
}
