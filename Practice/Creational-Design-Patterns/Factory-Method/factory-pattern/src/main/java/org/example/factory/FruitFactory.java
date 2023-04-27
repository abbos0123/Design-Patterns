package org.example.factory;

import org.example.model.Fruit;
import org.example.model.fruitimpl.Apple;
import org.example.model.fruitimpl.Grape;
import org.example.model.fruitimpl.Peach;

public class FruitFactory implements Factory {
    @Override
    public Fruit createFruit(String name) {
        if (name.equalsIgnoreCase("APPLE")) return new Apple();
        if (name.equalsIgnoreCase("PEACH")) return new Peach();
        if (name.equalsIgnoreCase("GRAPE")) return new Grape();
        return null;
    }
}
