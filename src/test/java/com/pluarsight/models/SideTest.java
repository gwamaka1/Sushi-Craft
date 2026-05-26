package com.pluarsight.models;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SideTest {

    @Test
    public void getName_SideName_ReturnsName() {
        // Arrange
        Side side = new Side("White Rice");

        // Act
        String ans = side.getName();

        // Assert
        assertEquals("White Rice", ans);
    }

    @Test
    public void getPrice_AnySize_ReturnsZero() {
        // Arrange
        Side side = new Side("White Rice");

        // Act
        double ans = side.getPrice("Large");

        // Assert
        assertEquals(0.0, ans);
    }

    @Test
    public void getDetails_SideName_ReturnsSideWithName() {
        // Arrange
        Side side = new Side("White Rice");

        // Act
        String ans = side.getDetails();

        // Assert
        assertEquals("Side: White Rice", ans);
    }
}