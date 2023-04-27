package org.example;

import org.example.adapter.DisplayAdapter;
import org.example.model.Item;
import org.example.model.ItemAdvanced;
import org.example.resource.ResourceAdvancedItem;
import org.example.resource.ResourceItem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DisplayerApplication application = new DisplayerApplication();
        List<Item> list = ResourceItem.generateResource();
        application.display(list);

     //   application.display(advancedList);
        List<ItemAdvanced> advancedList = ResourceAdvancedItem.generateAdvancedItemsList();
        DisplayAdapter adapter = new DisplayAdapter(application);
        adapter.displayAdvancedItems(advancedList);
    }

}