package org.example.resource;

import org.example.model.Item;
import org.example.model.RealItem;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class ResourceItem {
    public static List<Item> generateResource() {
        List<Item> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            Item item = new RealItem("Item " + i, "This is description of item " + i, i);
            list.add(item);
        }

        return list;
    }
}
