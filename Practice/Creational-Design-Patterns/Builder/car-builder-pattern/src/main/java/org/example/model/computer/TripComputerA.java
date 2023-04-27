package org.example.model.computer;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class TripComputerA implements TripComputer{
    private String name;
    private String company;
    private String functionality;

    public TripComputerA(String name, String  company, String  functionality){
        this.name = name;
        this.company = company;
        this.functionality = functionality;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setFunctionality() {
        this.functionality = functionality;
    }

    @Override
    public String getFunctionality() {
        return functionality;
    }
}
