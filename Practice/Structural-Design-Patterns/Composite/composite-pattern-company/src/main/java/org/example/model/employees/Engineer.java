package org.example.model.employees;

/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class Engineer implements Employee, ManageEmployee {

    private String name;
    private String surname;
    private int age;
    private String info;
    private double salary;
    private String position;
    private int experience;

    public Engineer(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return salary - salary * 0.13 + 3000;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double changeSalary(double newSalary) {
        this.salary = newSalary;
        return salary;
    }

    @Override
    public void changeExperience(int newExperience) {
        this.experience = newExperience;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
