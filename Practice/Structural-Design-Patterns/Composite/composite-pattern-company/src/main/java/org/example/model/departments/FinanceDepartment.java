package org.example.model.departments;

import org.example.model.employees.Employee;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class FinanceDepartment implements Department, DepartmentComposite {
    private List<Department> departments;
    private String name;
    public FinanceDepartment(String name) {
        this.departments = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addEmployee(Employee employee, Department department) {
        department.addEmployee(employee, department);
    }

    @Override
    public void removeEmployee(Employee employee, Department department) {
        department.removeEmployee(employee, department);
    }

    @Override
    public double calculateAllSalary() {
        double total = 0.0;
        for (Department department : departments)
            total += department.calculateAllSalary();
        return total;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departments;
    }

    @Override
    public void clearDepartments() {
        departments.clear();
    }
}
