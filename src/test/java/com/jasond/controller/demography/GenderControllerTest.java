package com.jasond.controller.demography;

import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;

import static org.junit.Assert.*;

public class GenderControllerTest {

    private GenderController genderController;

    @Before
    public void setUp() throws Exception {
        genderController = new GenderController();
    }

    @Test
    public void create() {
        genderController.create("");
    }
}