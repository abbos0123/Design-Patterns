package org.example.decorator.data;

public interface Datasource {
    void writeData(String data);
    String readData();
}
