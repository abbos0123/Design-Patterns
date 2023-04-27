package org.example.builder;

import org.example.model.car.BMWx7;
import org.example.model.car.Car;
import org.example.model.car.MercedesBenz;
import org.example.model.computer.TripComputer;
import org.example.model.engine.Engine;
import org.example.model.gps.GPS;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class MercedesBenzBuilder implements Builder {
    private Car car;

    public MercedesBenzBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new MercedesBenz();
        car.setName("MercedesBenz");
        car.setCompany("The Mercedes-Benz Group AG ");
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        car.setCarGPS(gps);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Car build() {
        Car product = car;
        reset();
        return product;
    }
}
