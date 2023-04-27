package org.example.model.engine;

/**
 * Author: Abbos Fayziboev
 * Date: 24/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class DslEngine implements Engine {
    private String name;
    private Long power;
    private String company;
    private String functionality;

    public DslEngine(String name, Long power, String company, String functionality) {
        this.name = name;
        this.power = power;
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
    public void setPower(Long power) {
        this.power = power;
    }

    @Override
    public Long getPower() {
        return power;
    }

    @Override
    public String getFunctionality() {
        return functionality;
    }
}
