package org.example.model.fruitimpl;

import org.example.model.Fruit;

public class Peach extends Fruit {

    public Peach() {
        super("Peach", "Yellow", 30000L);
    }

    @Override
    public void showVitamins() {
        System.out.println("It provides 6% of your daily vitamin A needs and 15% \n" +
                "of daily vitamin C needs. One medium peach also contains 2% or\n" +
                " more daily value of vitamins E and K, niacin, folate, iron, choline, \n" +
                "potassium, magnesium, phosphorus, manganese, zinc and copper.\n");
    }

    @Override
    public void description() {
        System.out.println("How do you describe a peach?\n" +
                "A peach is a soft, round, slightly furry fruit with sweet \n" +
                "yellow flesh and pinky-orange skin. Peaches grow in warm countries. \n" +
                "Something that is peach is pale pinky-orange in color.\n");
    }
}
