package org.example.builder;

import org.example.model.car.Car;
import org.example.model.computer.TripComputer;
import org.example.model.engine.Engine;
import org.example.model.gps.GPS;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public interface Builder {
    Builder reset();
    Builder setSeats(int n);
    Builder setEngine(Engine engine);
    Builder setGPS(GPS gps);
    Builder setTripComputer(TripComputer tripComputer);
    Car build();
}
