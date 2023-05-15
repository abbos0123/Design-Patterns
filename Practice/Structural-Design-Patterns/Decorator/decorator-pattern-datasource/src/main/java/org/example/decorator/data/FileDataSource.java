package org.example.decorator.data;

import org.example.decorator.data.Data;
import org.example.decorator.data.Datasource;

public class FileDataSource implements Datasource {
    private String filename;
    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("WRITING DATA TO FILE:");
        System.out.println("FILENAME: " + filename);
        System.out.println("DATA : " + data);
        Data.setData(data);
        System.out.println();
    }

    @Override
    public String readData() {
        System.out.println("READING DATA TO FILE:");
        System.out.println("FILENAME: " + filename);
        return Data.getData();
    }
}
