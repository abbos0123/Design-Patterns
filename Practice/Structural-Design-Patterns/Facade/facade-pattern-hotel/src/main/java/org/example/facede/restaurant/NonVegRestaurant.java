package org.example.facede.restaurant;

import org.example.facede.menuimp.Menu;
import org.example.facede.menuimp.NonVegMenu;
import org.example.facede.restaurant.Hotel;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
