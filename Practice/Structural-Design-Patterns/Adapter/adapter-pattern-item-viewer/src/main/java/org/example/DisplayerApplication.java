package org.example;

import org.example.displayer.ItemDisplayer;
import org.example.displayer.ItemDisplayerImpl;
import org.example.model.Item;

import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class DisplayerApplication {
    public void display(List<Item> list){
        System.out.println("\n\n----------------Application Start--------------------");

        ItemDisplayer itemDisplayer = new ItemDisplayerImpl();
        itemDisplayer.display(list);

        System.out.println("-------------------Process Ended---------------------");
    }
}
