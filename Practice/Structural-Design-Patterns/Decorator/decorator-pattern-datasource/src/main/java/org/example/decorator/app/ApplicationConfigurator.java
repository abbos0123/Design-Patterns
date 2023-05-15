package org.example.decorator.app;

import org.example.decorator.data.Datasource;
import org.example.decorator.data.FileDataSource;
import org.example.decorator.decor.CompressionDecorator;
import org.example.decorator.decor.EncryptionDecorator;

public class ApplicationConfigurator {

    void configure(boolean enabledEncryption, boolean enabledCompression){
        Datasource datasource = new FileDataSource("salary.dat");

        if (enabledEncryption)
             datasource = new EncryptionDecorator(datasource);

        if (enabledCompression)
            datasource = new CompressionDecorator(datasource);

        SalaryManager salaryManager = new SalaryManager(datasource);

        salaryManager.save();
        System.out.println("DATA : " + salaryManager.load());
    }
}
