package org.example.resource;

import org.example.model.AdvancedItem;
import org.example.model.ItemAdvanced;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class ResourceAdvancedItem {
    public static List<ItemAdvanced> generateAdvancedItemsList() {
        List<ItemAdvanced> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(new AdvancedItem("Advanced Item " + i, "Description of advanced item " + i));

        return list;
    }
}
