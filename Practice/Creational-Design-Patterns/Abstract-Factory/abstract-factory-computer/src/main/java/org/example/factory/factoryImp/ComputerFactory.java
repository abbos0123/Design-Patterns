package org.example.factory.factoryImp;

import org.example.factory.ComputerAbstractFactory;
import org.example.model.Computer;

public class ComputerFactory {
    private ComputerAbstractFactory factory;

    public ComputerFactory(ComputerAbstractFactory factory){
        this.factory = factory;
    }
    public Computer createComputer(String type){
        return factory.createComputer(type);
    }

    public void setFactory(ComputerAbstractFactory factory) {
        this.factory = factory;
    }
}
