package org.example.factories;

import org.example.abstractfactory.AbstractFactory;
import org.example.domain.animal.Animal;
import org.example.domain.animal.Dog;
import org.example.domain.animal.Horse;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String name) {
        if (name.equalsIgnoreCase("DOG"))
            return new Dog();
        else if (name.equalsIgnoreCase("HORSE"))
            return new Horse();

        return null;
    }
}
