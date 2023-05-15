package org.example.decorator.decor;

import org.example.decorator.data.Datasource;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(Datasource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        data = "Encrypted : " + data;
        super.writeData(data);
    }

    @Override
    public String readData() {
        String data =  super.readData();
        data = "Decrypted : " + data;
        return data;
    }
}
