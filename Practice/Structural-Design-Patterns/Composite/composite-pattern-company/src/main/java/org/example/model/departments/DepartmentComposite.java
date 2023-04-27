package org.example.model.departments;

import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public interface DepartmentComposite {
    void addDepartment(Department department);
    void removeDepartment(Department department);

    List<Department> getAllDepartments();

    void clearDepartments();

    String getName();
}
