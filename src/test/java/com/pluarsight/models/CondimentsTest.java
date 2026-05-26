package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondimentsTest {
    @Test
    public void getName_CondimentName_ReturnsName() {
        // Arrange
        Condiments condiment = new Condiments("Spicy Mayo");

        // Act
        String ans = condiment.getName();

        // Assert
        assertEquals("Spicy Mayo", ans);
    }
    @Test
    public void getPrice_AnySize_ReturnsZero() {
        // Arrange
        Condiments condiment = new Condiments("Spicy Mayo");

        // Act
        double ans = condiment.getPrice("Large");

        // Assert
        assertEquals(0.0, ans);
    }
    @Test
    public void getDetails_CondimentName_ReturnsCondimentWithName() {
        // Arrange
        Condiments condiment = new Condiments("Spicy Mayo");

        // Act
        String ans = condiment.getDetails();

        // Assert
        assertEquals("Condiment: Spicy Mayo", ans);
    }

}