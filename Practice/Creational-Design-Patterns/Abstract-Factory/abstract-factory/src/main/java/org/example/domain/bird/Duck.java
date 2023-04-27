package org.example.domain.bird;

public class Duck implements Bird{
    @Override
    public String getBird() {
        return "I am Duck ...";
    }

    @Override
    public String fly() {
        return "I can fly...";
    }

    @Override
    public String eat() {
        return "I like to each fish...";
    }
}
