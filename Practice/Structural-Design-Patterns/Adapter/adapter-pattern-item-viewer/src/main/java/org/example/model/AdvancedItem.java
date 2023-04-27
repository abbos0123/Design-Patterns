package org.example.model;

/**
 * Author: Abbos Fayziboev
 * Date: 13/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class AdvancedItem implements ItemAdvanced{
    private String name;
    private String data;

    public AdvancedItem(String name, String data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public String getData() {
        return data;
    }
}
