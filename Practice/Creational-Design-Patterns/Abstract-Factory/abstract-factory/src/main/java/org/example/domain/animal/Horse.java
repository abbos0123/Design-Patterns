package org.example.domain.animal;

public class Horse implements Animal{
    @Override
    public String getAnimal() {
        return "I am a horse ... ";
    }

    @Override
    public String makeSound() {
        return "I am horse and I am making horse sound...";
    }
}
