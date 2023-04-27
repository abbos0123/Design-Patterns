package org.example;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.impl.FactoryProvider;
import org.example.domain.animal.Animal;
import org.example.domain.bird.Bird;

public class Application {
    public static void main(String[] args) {
        System.out.println("------------------Application is running------------------");
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("ANIMAL");
        AbstractFactory<Bird> birdFactory = FactoryProvider.getFactory("BIRD");
        FactoryProvider.getFactory("BIRD");

        //Animals
        Animal dog = animalFactory.create("DOG");
        Animal horse = animalFactory.create("HORSE");

        //Birds
        Bird pigeon = birdFactory.create("PIGEON");

        System.out.println();
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound());

        System.out.println();
        System.out.println(horse.getAnimal());
        System.out.println(horse.makeSound());

        System.out.println();
        System.out.println(pigeon.getBird());
        System.out.println(pigeon.fly());
        System.out.println(pigeon.eat());

        System.out.println("\n-------------------Application finished--------------------");
    }
}