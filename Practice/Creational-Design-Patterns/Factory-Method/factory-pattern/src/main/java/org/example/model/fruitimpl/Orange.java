package org.example.model.fruitimpl;

import org.example.model.Fruit;

public class Orange extends Fruit {

    public Orange(){
      super("Orange", "orange", 23_000_000L);
    }
    @Override
    public void showVitamins() {
        System.out.println("Vitamin C, D, E");
    }

    @Override
    public void description() {
        System.out.println("Great taste ...");
    }
}
