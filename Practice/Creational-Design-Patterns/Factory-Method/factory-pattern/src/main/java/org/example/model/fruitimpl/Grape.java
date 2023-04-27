package org.example.model.fruitimpl;

import org.example.model.Fruit;

public class Grape extends Fruit {

    public Grape() {
        super("Grape", "Black", 5000L);
    }

    @Override
    public void showVitamins() {
        System.out.println("As you can see, grapes are a rich source of copper and vitamin K. \n" +
                "Copper is an essential mineral involved in energy production, while vitamin K \n" +
                "is vital for blood clotting and healthy bones ( 2 , 3 ). \n" +
                "Grapes also provide good amounts of B vitamins like thiamine, riboflavin, and B6.\n");
    }

    @Override
    public void description() {
        System.out.println("There are four possible tastes in grapes: \n" +
                "acidness (tart, or sour), sweetness, saltiness, and bitterness. \n" +
                "White grapes are very low in tannins and other bitter-tasting substances.\n");

    }
}
