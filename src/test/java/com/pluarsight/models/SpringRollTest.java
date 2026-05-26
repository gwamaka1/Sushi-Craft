package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpringRollTest {

    @Test
    public void getType_SpringRollType_ReturnsType() {
        // Arrange
        SpringRoll springRoll = new SpringRoll("Chicken");

        // Act
        String ans = springRoll.getType();

        // Assert
        assertEquals("Chicken", ans);
    }

    @Test
    public void getPrice_SpringRoll_ReturnsOneDollarAndFiftyCents() {
        // Arrange
        SpringRoll springRoll = new SpringRoll("Chicken");

        // Act
        double ans = springRoll.getPrice();

        // Assert
        assertEquals(1.50, ans);
    }

    @Test
    public void getDetails_ChickenSpringRoll_ReturnsTypeSpringRollWithPrice() {
        // Arrange
        SpringRoll springRoll = new SpringRoll("Chicken");

        // Act
        String ans = springRoll.getDetails();

        // Assert
        assertEquals("Chicken SpringRoll- $1.5", ans);
    }

    @Test
    public void getDetails_VeggieSpringRoll_ReturnsTypeSpringRollWithPrice() {
        // Arrange
        SpringRoll springRoll = new SpringRoll("Veggie");

        // Act
        String ans = springRoll.getDetails();

        // Assert
        assertEquals("Veggie SpringRoll- $1.5", ans);
    }
}