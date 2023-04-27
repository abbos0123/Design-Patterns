package org.example;

import org.example.builder.BMWBuilder;
import org.example.builder.MercedesBenzBuilder;
import org.example.director.Director;
import org.example.model.car.BMWx7;
import org.example.model.car.Car;
import org.example.model.car.MercedesBenz;

public class ClientApplication {
    public static void main(String[] args) {
        MercedesBenzBuilder mercedesBenzBuilder = new MercedesBenzBuilder();
        BMWBuilder bmwBuilder = new BMWBuilder();
        Director director = new Director();

        Car carBMW = director.constructBMW(bmwBuilder);
        Car carMers = director.constructMers(mercedesBenzBuilder);

        System.out.println(carBMW.toString());
        System.out.println("----------------------------------------------------------");
        System.out.println(carMers.toString());
    }
}