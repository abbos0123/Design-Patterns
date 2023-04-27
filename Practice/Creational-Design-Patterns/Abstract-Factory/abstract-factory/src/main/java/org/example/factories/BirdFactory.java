package org.example.factories;

import org.example.abstractfactory.AbstractFactory;
import org.example.domain.bird.Bird;
import org.example.domain.bird.Duck;
import org.example.domain.bird.Pigeon;

public class BirdFactory implements AbstractFactory<Bird> {
    @Override
    public Bird create(String name) {
        if (name.equalsIgnoreCase("DUCK"))
            return new Duck();
        else if (name.equalsIgnoreCase("PIGEON"))
            return new Pigeon();

        return null;
    }
}
