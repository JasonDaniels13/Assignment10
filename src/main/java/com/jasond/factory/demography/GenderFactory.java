package com.jasond.factory.demography;


import com.jasond.domain.demography.Gender;

public class GenderFactory {

    public static Gender getGender(String gender){
        return new Gender.Builder()
                .id("1")
//              .id(Misc.generateId())
                .descr(gender)
                .build();
    }
}
