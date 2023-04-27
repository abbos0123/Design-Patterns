package org.example.model.car;

import org.example.model.computer.TripComputer;
import org.example.model.engine.Engine;
import org.example.model.gps.GPS;

public interface Car {
    void setCarGPS(GPS gps);
    GPS getCarGPS();
    void setSeats(int seats);
    int getSeats();
    void setName(String name);
    String getName();
    void setEngine(Engine engine);
    Engine getEngine();
    void setCompany(String company);
    String getCompany();
    String getInfo();
    void setInfo(String info);
    void setTripComputer(TripComputer tripComputer);
    TripComputer getTripComputer();

}
