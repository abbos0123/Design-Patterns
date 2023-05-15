package org.example;

import org.example.decorator.app.Application;
import org.example.decorator.app.ApplicationConfigurator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------START APPLICATION------------------------------\n");
        ApplicationConfigurator configurator = new ApplicationConfigurator();
        Application application = new Application(configurator);
        application.work();
        System.out.println("\n--------------------------------STOP  APPLICATION------------------------------");
    }
}