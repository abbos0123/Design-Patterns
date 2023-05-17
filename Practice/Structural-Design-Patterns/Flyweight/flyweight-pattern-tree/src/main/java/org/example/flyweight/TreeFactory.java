package org.example.flyweight;

import java.util.HashMap;

public class TreeFactory {
    private final static HashMap<String, TreeType> trees = new HashMap<>();

    public static TreeType getTree(String  name, String color, String texture){
        String key = name +"_" + color +"_" + texture;
        TreeType treeType = trees.get(key);

        if (treeType == null){
            treeType = new TreeType(name, color, texture);
            trees.put(key, treeType);
            System.out.println("Tree type is created : " + name + " : " + color + " : " + texture);
        }

        return treeType;
    }
}
