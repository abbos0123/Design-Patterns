package org.example.decorator.decor;

import org.example.decorator.data.Datasource;

public class DataSourceDecorator implements Datasource {
    private Datasource dataSource = null;

    public DataSourceDecorator(Datasource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
