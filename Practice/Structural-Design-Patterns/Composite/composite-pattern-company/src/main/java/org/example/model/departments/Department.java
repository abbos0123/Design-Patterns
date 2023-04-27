package org.example.model.departments;

import org.example.model.employees.Employee;


/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public interface Department {
    void addEmployee(Employee employee, Department department);
    void removeEmployee(Employee employee, Department department);
    double calculateAllSalary();
    String getName();
}
