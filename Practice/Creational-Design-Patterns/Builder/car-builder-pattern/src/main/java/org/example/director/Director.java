package org.example.director;

import org.example.builder.BMWBuilder;
import org.example.builder.MercedesBenzBuilder;
import org.example.model.car.Car;
import org.example.model.computer.TripComputerA;
import org.example.model.computer.TripComputerB;
import org.example.model.engine.DslEngine;
import org.example.model.engine.EssEngine;
import org.example.model.gps.GalileoGPS;
import org.example.model.gps.GlonassGPS;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class Director {
    public Car constructBMW(BMWBuilder builder) {
        return builder.reset()
                .setSeats(6)
                .setEngine(new DslEngine("DSL", 5000L, "CompanyXXX", "This is great engine works with 96 Dizel"))
                .setGPS(new GalileoGPS("Galileo GPS",
                        "This is description of Galileo GPS",
                        "The functionality of Galileo Gps is ....", "Company ABC"))
                .setTripComputer(new TripComputerA("Trip Computer A", "Company A", "Functionality of A"))
                .build();
    }

    public Car constructMers(MercedesBenzBuilder builder) {
        return builder.reset()
                .setSeats(2)
                .setEngine(new EssEngine("ESS", 2000L, "CompanyYYY", "This is great engine..."))
                .setGPS(new GlonassGPS("Glonass GPS",
                        "This is description of Glonass GPS",
                        "The functionality of Gloanass GPS is ....", "Company BBC"))
                .setTripComputer(new TripComputerB("Trip Computer B", "Company B", "Functionality of B"))
                .build();
    }


}
