package org.example.facede.restaurant;

import org.example.facede.menuimp.BothMenu;
import org.example.facede.menuimp.Menu;

public class BothRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        return new BothMenu();
    }
}
