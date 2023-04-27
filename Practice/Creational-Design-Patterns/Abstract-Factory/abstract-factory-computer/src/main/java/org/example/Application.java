package org.example;

import org.example.factory.ComputerAbstractFactory;
import org.example.factory.factoryImp.ComputerFactory;
import org.example.model.Computer;

public class Application {
    private ComputerFactory factory;

    public Application(ComputerFactory factory){
        this.factory = factory;
    }

    public void setFactory(ComputerAbstractFactory abstractFactory){
        this.factory.setFactory(abstractFactory);
    }

    public void showComputerFunctionalityAndOtherInfo(String type){
        Computer computer = factory.createComputer(type);
        System.out.println(computer.toString());
        System.out.println(computer.getFunctionality());
        System.out.println("\n------------------------------------------------------------------\n");
    }
}
