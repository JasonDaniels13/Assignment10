package com.jasond.controller.demography;


import com.jasond.domain.demography.Race;
import com.jasond.factory.demography.RaceFactory;
import com.jasond.service.RaceService;
import com.jasond.service.demography.impl.RaceServiceImpl;

public class RaceController {

    private RaceService raceService = RaceServiceImpl.getService();

    public void create(String raceId) {

        Race race = RaceFactory.getRace("White");
        raceService.create("2345", race);

        System.out.println(race);
    }
}
