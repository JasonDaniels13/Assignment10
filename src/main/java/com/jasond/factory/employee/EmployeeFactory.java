package com.jasond.factory.employee;


import com.jasond.domain.employee.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(String firstName, String lastName){
        return new Employee.Builder()
                .employeeNumber("3698")
//              .employeeNumber(Misc.generateId())
                .employeeFirstName(firstName)
                .employeeLastName(lastName)
                .build();
    }
}
