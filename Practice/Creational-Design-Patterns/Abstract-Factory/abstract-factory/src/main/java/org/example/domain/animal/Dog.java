package org.example.domain.animal;

public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "I ma a dog ...";
    }

    @Override
    public String makeSound() {
        return "Vuf Vuf ...";
    }
}
