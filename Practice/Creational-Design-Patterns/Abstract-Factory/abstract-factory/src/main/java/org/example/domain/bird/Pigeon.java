package org.example.domain.bird;

public class Pigeon implements Bird{
    @Override
    public String getBird() {
        return "I am domestic pigeon(dove) ...";
    }

    @Override
    public String fly() {
        return "I like fling and this is my daily activity ...";
    }

    @Override
    public String eat() {
        return "I love to eat wheat ...";
    }
}
