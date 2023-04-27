package org.example.displayer;

import org.example.model.Item;

import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class ItemDisplayerImpl implements ItemDisplayer {
    @Override
    public void display(List<Item> items) {
        for (Item item : items) {
            System.out.println("NAME : " + item.getName().toUpperCase());
            System.out.println("Description: " + item.getText().toLowerCase());
            for (int i = 0; i < item.getHeight(); i++)
                System.out.print("---------");
            System.out.println();
        }
    }
}
