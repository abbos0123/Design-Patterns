package org.example.facede.hotelworker;

import org.example.facede.menuimp.BothMenu;
import org.example.facede.menuimp.NonVegMenu;
import org.example.facede.menuimp.VegMenu;

public interface HotelKeeper {
    VegMenu getVegMenu();
    NonVegMenu getNonVegMenu();
    BothMenu getBothMenu();
}
