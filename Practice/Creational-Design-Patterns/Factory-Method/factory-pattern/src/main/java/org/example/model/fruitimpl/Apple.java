package org.example.model.fruitimpl;

import org.example.model.Fruit;

public class Apple extends Fruit {

    public Apple() {
        super("Apple", "Red", 3000L);
    }

    @Override
    public void showVitamins() {
        System.out.println("Apples are a good source of fiber and vitamin C. \n" +
                "They also contain antioxidants, like vitamin E, and polyphenols \n" +
                "that contribute to the fruit's numerous health benefits.\n");
    }

    @Override
    public void description() {
        System.out.println("apple, (Malus domestica), domesticated tree and fruit \n" +
                " of the rose family (Rosaceae), one of the most widely cultivated \n" +
                "tree fruits. Apples are predominantly grown for sale as fresh fruit,\n" +
                " though apples are also used commercially for vinegar, juice, jelly, \n" +
                "applesauce, and apple butter and are canned as pie stock.\n");
    }
}
