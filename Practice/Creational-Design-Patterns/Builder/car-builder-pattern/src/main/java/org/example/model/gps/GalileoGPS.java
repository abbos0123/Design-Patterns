package org.example.model.gps;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class GalileoGPS implements GPS{
    private String name;
    private String desc;
    private String functionality;
    private String company;

    public GalileoGPS(String name, String desc, String functionality, String company){
        this.name = name;
        this.desc = desc;
        this.functionality = functionality;
        this.company = company;
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
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return desc;
    }

    @Override
    public String getFunctionality() {
        return functionality;
    }
}
