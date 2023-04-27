package org.example;

import org.example.model.Fruit;

public class BusinessApplication {
    public static void provideData(Fruit fruit) {
        if (fruit == null) {
            System.err.println("Null Object !");
            return;
        }

        System.out.println("---------------------------" + fruit.name + "--------------------------");
        System.out.println("NAME: " + fruit.name);
        System.out.println("PRICE : " + fruit.price);
        System.out.println("COLOR: " + fruit.color);
        System.out.println("-----------------------DESCRIPTION-------------------------");
        fruit.description();
        System.out.println("-------------------------VITAMINS--------------------------");
        fruit.showVitamins();
        System.out.println("-----------------------------------------------------------");
    }
}
