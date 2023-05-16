package org.example.facede.restaurant;

import org.example.facede.menuimp.Menu;
import org.example.facede.menuimp.NonVegMenu;
import org.example.facede.menuimp.VegMenu;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
