package org.example.model.employees;

/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public interface ManageEmployee {
    String getName();

    double calculateSalary();

    String getPosition();

    int getExperience();

    void setName(String name);

    double changeSalary(double newSalary);

    void changeExperience(int newExperience);

    void  setInfo(String info);
}
