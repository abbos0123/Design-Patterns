package org.example.facede.hotelworker;

import org.example.facede.menuimp.BothMenu;
import org.example.facede.menuimp.NonVegMenu;
import org.example.facede.menuimp.VegMenu;
import org.example.facede.restaurant.BothRestaurant;
import org.example.facede.restaurant.NonVegRestaurant;
import org.example.facede.restaurant.VegRestaurant;

public class HotelKeeperImplementation implements HotelKeeper {
    public VegMenu getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) v.getMenu();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu) v.getMenu();
        return NonvegMenu;
    }

    @Override
    public BothMenu getBothMenu() {
        BothRestaurant v = new BothRestaurant();
        BothMenu bothMenu = (BothMenu) v.getMenu();
        return bothMenu;
    }
}
