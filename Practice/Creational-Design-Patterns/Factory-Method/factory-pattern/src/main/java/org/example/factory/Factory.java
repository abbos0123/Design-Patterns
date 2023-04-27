package org.example.factory;

import org.example.model.Fruit;

public interface Factory {
    Fruit createFruit(String name);
}
