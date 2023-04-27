package org.example.model.engine;

public interface Engine {
    void setName(String name);
    String getName();
    void setCompany(String company);
    String getCompany();
    void setPower(Long power);
    Long getPower();
    String getFunctionality();
}
