package org.example.adapter;

import org.example.DisplayerApplication;
import org.example.model.Item;
import org.example.model.ItemAdvanced;
import org.example.model.RealItem;

import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class DisplayAdapter {
    private DisplayerApplication application;

    public DisplayAdapter(DisplayerApplication application) {
        this.application = application;
    }

    public void displayAdvancedItems(List<ItemAdvanced> list) {
        application.display(list.stream().map(this::convertToItem).toList());
    }

    private Item convertToItem(ItemAdvanced advancedItem) {
        return new RealItem(advancedItem.getItemName(), advancedItem.getData(), 5);
    }
}
