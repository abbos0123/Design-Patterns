package org.example.model.departments;

import org.example.model.employees.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class SalesDepartment implements Department {
    private List<Employee> employees;
    private String name;
    public SalesDepartment(String name) {
        this.employees = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addEmployee(Employee employee, Department department) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee, Department department) {
        employees.remove(employee);
    }

    @Override
    public double calculateAllSalary() {
        double total = 0.0;

        for (Employee employee : employees)
            total += employee.calculateSalary();

        return total;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
