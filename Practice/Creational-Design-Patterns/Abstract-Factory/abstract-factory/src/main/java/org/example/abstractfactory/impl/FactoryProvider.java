package org.example.abstractfactory.impl;

import org.example.abstractfactory.AbstractFactory;
import org.example.factories.AnimalFactory;
import org.example.factories.BirdFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if("Animal".equalsIgnoreCase(choice))
             return new AnimalFactory();
        if ("Bird".equalsIgnoreCase(choice))
            return new BirdFactory();

        return null;
    }
}
