package org.example;

import org.example.factory.ComputerAbstractFactory;
import org.example.factory.factoryImp.ComputerFactory;
import org.example.factory.factoryImp.LaptopFactory;
import org.example.factory.factoryImp.PcFactory;
import org.example.factory.factoryImp.ServerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------This is Application for Computer customers-----------\n");
        ComputerAbstractFactory computerAbstractFactory = new PcFactory("cpu of PC", "ram of PC", "hdd of PC");
        ComputerFactory factory = new ComputerFactory(computerAbstractFactory);
        Application application = new Application(factory);

        application.showComputerFunctionalityAndOtherInfo("PC");
        application.showComputerFunctionalityAndOtherInfo("PCDESKTOP");

        System.out.println("\n--------------Changing factory to new Laptop Factory--------------\n");

        factory.setFactory(new LaptopFactory("CPU of LaptopXXX", "RAM of LaptopXXX", "HDD of LaptopXXX"));
        application.showComputerFunctionalityAndOtherInfo("LAPTOPHP");
        application.showComputerFunctionalityAndOtherInfo("LAPTOP");

        System.out.println("\n--------------Changing factory to new Server Factory--------------\n");
        factory.setFactory(new ServerFactory("CPU of ServerXXX", "RAM of ServerXXX", "HDD of ServerXXX"));
        application.showComputerFunctionalityAndOtherInfo("SERVER");
        application.showComputerFunctionalityAndOtherInfo("SERVERDB");

    }
}