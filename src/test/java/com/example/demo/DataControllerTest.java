package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.Controller.DataController;

public class DataControllerTest {

    private final DataController dataController = new DataController();

    @Test
    void testHealthCheck() {
        assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    void testVersion() {
        assertEquals(
            "The actual version is 1.0.0",
            dataController.version()
        );
    }

    @Test
    void testNations() {
        assertEquals(
            10,
            dataController.getRandomNations().size()
        );
    }

    @Test
    void testCurrencies() {
        assertEquals(
            20,
            dataController.getRandomCurrencies().size()
        );
    }
}
