package com.jasond.factory.demography;


import com.jasond.domain.demography.Race;

public class RaceFactory {

    public static Race getRace(String race){
        return new Race.Builder()
                .id("1111")
//              .id(Misc.generateId())
                .descr(race)
                .build();
    }
}
