package org.example.decorator.decor;

import org.example.decorator.data.Datasource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(Datasource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        data = "Compressed : " + data;
        super.writeData(data);
    }

    @Override
    public String readData() {
        return "Decompress  : " + super.readData();
    }
}
