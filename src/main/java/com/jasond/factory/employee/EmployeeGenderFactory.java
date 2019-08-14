package com.jasond.factory.employee;


import com.jasond.domain.employee.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender getEmployeeGender(String number){
        return new EmployeeGender.Builder()
                .genderId("1")
//              .genderId(Misc.generateId())
                .employeeNumber(number)
                .build();
    }
}

