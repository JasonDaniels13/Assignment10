package com.jasond.controller.employee;


import com.jasond.domain.demography.Race;
import com.jasond.domain.employee.EmployeeGender;
import com.jasond.factory.demography.RaceFactory;
import com.jasond.factory.employee.EmployeeGenderFactory;
import com.jasond.service.RaceService;
import com.jasond.service.demography.impl.RaceServiceImpl;
import com.jasond.service.EmployeeGenderService;
import com.jasond.service.employee.impl.EmployeeGenderServiceImpl;

public class EmployeeGenderController {


    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();

    public void create(String genderId, String raceId) {

        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender("3698");
        employeeGenderService.create("male", employeeGender);

        Race race = RaceFactory.getRace("Colored");
        raceService.create("Colored", race);

        System.out.println(employeeGender);
    }

}
