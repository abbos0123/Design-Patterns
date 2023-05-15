package org.example.decorator.data;

public class Data {
    private static String dataContent = "";

    public static String getData() {
        return dataContent;
    }

    public static void setData(String data) {
        dataContent = data;
    }
}
