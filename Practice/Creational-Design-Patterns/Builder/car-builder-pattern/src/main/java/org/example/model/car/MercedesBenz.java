package org.example.model.car;

import org.example.model.computer.TripComputer;
import org.example.model.engine.Engine;
import org.example.model.gps.GPS;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class MercedesBenz implements Car {
    private String name;
    private int seats;
    private GPS gps;
    private Engine engine;
    private String info;
    private String company;
    private TripComputer tripComputer;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCarGPS(GPS gps) {
        this.gps = gps;
    }

    @Override
    public GPS getCarGPS() {
        return gps;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public TripComputer getTripComputer() {
        return tripComputer;
    }

    @Override
    public String toString() {
        return  "Name      : " + name +"\n"+
                "Company   : " + company +"\n" +
                "Engine    : " + engine.getName();

    }
}
