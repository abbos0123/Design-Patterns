package org.example.decorator.app;

import org.example.decorator.data.Datasource;

public class SalaryManager {
    private Datasource source;
    private String salaryRecords = "{Abbos-1200, Davran-1200, Bobur-4500, Hamdam-3000}";
    public SalaryManager(Datasource source) {
        this.source = source;
    }

    public String load(){
       return source.readData();
    }

    public void save(){
        source.writeData(salaryRecords);
    }
}
