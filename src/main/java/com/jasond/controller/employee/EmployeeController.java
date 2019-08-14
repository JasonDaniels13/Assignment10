package com.jasond.controller.employee;


import com.jasond.domain.demography.Gender;
import com.jasond.domain.demography.Race;
import com.jasond.domain.employee.Employee;
import com.jasond.domain.employee.EmployeeGender;
import com.jasond.factory.demography.GenderFactory;
import com.jasond.factory.demography.RaceFactory;
import com.jasond.factory.employee.EmployeeFactory;
import com.jasond.factory.employee.EmployeeGenderFactory;
import com.jasond.service.GenderService;
import com.jasond.service.demography.impl.GenderServiceImpl;
import com.jasond.service.RaceService;
import com.jasond.service.demography.impl.RaceServiceImpl;
import com.jasond.service.EmployeeGenderService;
import com.jasond.service.EmployeeService;
import com.jasond.service.employee.impl.EmployeeGenderServiceImpl;
import com.jasond.service.employee.impl.EmployeeServiceImpl;

public class EmployeeController {
    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(String firstName, String lastName, int genderId, int raceId) {

        Employee employee = EmployeeFactory.getEmployee(firstName, lastName);
        employeeService.create("John",employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender("1");
        employeeGenderService.create("male", employeeGender);

        Race race = RaceFactory.getRace("White");
        raceService.create("White", race);

        Gender gender = GenderFactory.getGender("Male");
        genderService.create("1234", gender);

        System.out.println(employee);
    }


}
