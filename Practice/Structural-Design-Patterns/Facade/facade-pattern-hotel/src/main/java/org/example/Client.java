package org.example;

import org.example.facede.hotelworker.HotelKeeper;
import org.example.facede.hotelworker.HotelKeeperImplementation;
import org.example.facede.menuimp.BothMenu;
import org.example.facede.menuimp.NonVegMenu;
import org.example.facede.menuimp.VegMenu;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeperImplementation();
        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        BothMenu bothMenu = keeper.getBothMenu();
    }
}