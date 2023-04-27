package org.example.app;

import org.example.model.departments.*;
import org.example.model.employees.Developer;
import org.example.model.employees.Engineer;
import org.example.model.employees.Hr;
import org.example.model.employees.Merchants;

/**
 * Author: Abbos Fayziboev
 * Date: 25/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class CompanyApp {
    private Company company;

    public Company buildCompany() {
        System.out.println("-------------------- Starting to organize company -------------------");
        company = new Company("UniqueCode");

 //       System.out.println("----------------------- Finance department  -------------------------");
        FinanceDepartment financeDepartment = new FinanceDepartment("Finance Department");

        Department purchaseDepartment = new PurchangeDepartment("Purchase department");
        purchaseDepartment.addEmployee(new Merchants("Abbos", 5000), purchaseDepartment);
        purchaseDepartment.addEmployee(new Merchants("Oybek", 8000), purchaseDepartment);

        Department saleDepartment = new SalesDepartment("Sale department");
        saleDepartment.addEmployee(new Merchants("Qodir", 2000), saleDepartment);
        saleDepartment.addEmployee(new Merchants("Bobur", 6000), saleDepartment);

        financeDepartment.addDepartment(purchaseDepartment);
        financeDepartment.addDepartment(saleDepartment);

 //       System.out.println("-------------------- Human Resource department ----------------------");
        Department humanResourceDepartment = new HumanResourceDepartment("Human Resource department");
        humanResourceDepartment.addEmployee(new Hr("Zebo", 4000), humanResourceDepartment);
        humanResourceDepartment.addEmployee(new Hr("Shaxlo", 4000), humanResourceDepartment);

//        System.out.println("------------------- Operations Resource department ---------------------");
        Department operationsDepartment = new OperationsDepartment("Operations department");
        operationsDepartment.addEmployee(new Engineer("Abbos", 25000), operationsDepartment);
        operationsDepartment.addEmployee(new Developer("Lola", 3000), operationsDepartment);
        operationsDepartment.addEmployee(new Developer("Doston", 5000), operationsDepartment);

        company.addDepartment(financeDepartment);
        company.addDepartment(humanResourceDepartment);
        company.addDepartment(operationsDepartment);

        System.out.println("--------------------- Finance department salary ---------------------");
        System.out.println(financeDepartment.calculateAllSalary());

        System.out.println("------------------ Human resource department salary -----------------");
        System.out.println(humanResourceDepartment.calculateAllSalary());

        System.out.println("------------------- Operations department salary --------------------");
        System.out.println(operationsDepartment.calculateAllSalary());

        System.out.println("-----------------Finishing to  organize  company -------------------");

        return company;
    }
}
