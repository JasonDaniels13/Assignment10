package com.jasond.controller.demography;

import org.junit.Before;
import org.junit.Test;


public class RaceControllerTest {

    private RaceController raceController;

    @Before
    public void setUp() throws Exception {
        raceController = new RaceController();
    }

    @Test
    public void create() {
        raceController.create(" ");
    }
}