package com.jasond.controller.demography;

import com.jasond.domain.demography.Gender;
import com.jasond.factory.demography.GenderFactory;
import com.jasond.service.GenderService;
import com.jasond.service.demography.impl.GenderServiceImpl;

public class GenderController {
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(String genderId) {

        Gender gender = GenderFactory.getGender("Male");
        genderService.create("1", gender);

        System.out.println(gender);
    }
}
