package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeatsTest {

    @Test
    public void getName_MeatName_ReturnsName() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        String ans = meat.getName();

        // Assert
        assertEquals("Salmon", ans);
    }

    @Test
    public void getDetails_MeatName_ReturnsMeatsWithName() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        String ans = meat.getDetails();

        // Assert
        assertEquals("Meats: Salmon", ans);
    }

    @Test
    public void isExtra_MeatIsExtra_ReturnsTrue() {
        // Arrange
        Meats meat = new Meats("Salmon", true);

        // Act
        boolean ans = meat.isExtra();

        // Assert
        assertTrue(ans);
    }

    @Test
    public void isExtra_MeatIsNotExtra_ReturnsFalse() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        boolean ans = meat.isExtra();

        // Assert
        assertFalse(ans);
    }

    @Test
    public void getPrice_SmallNotExtra_ReturnsOneDollar() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        double ans = meat.getPrice("small");

        // Assert
        assertEquals(1.00, ans);
    }

    @Test
    public void getPrice_SmallExtra_ReturnsOneDollarAndFiftyCents() {
        // Arrange
        Meats meat = new Meats("Salmon", true);

        // Act
        double ans = meat.getPrice("small");

        // Assert
        assertEquals(1.50, ans);
    }

    @Test
    public void getPrice_MediumNotExtra_ReturnsTwoDollars() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        double ans = meat.getPrice("medium");

        // Assert
        assertEquals(2.00, ans);
    }

    @Test
    public void getPrice_MediumExtra_ReturnsThreeDollars() {
        // Arrange
        Meats meat = new Meats("Salmon", true);

        // Act
        double ans = meat.getPrice("medium");

        // Assert
        assertEquals(3.00, ans);
    }

    @Test
    public void getPrice_LargeNotExtra_ReturnsThreeDollars() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        double ans = meat.getPrice("large");

        // Assert
        assertEquals(3.00, ans);
    }

    @Test
    public void getPrice_LargeExtra_ReturnsFourDollarsAndFiftyCents() {
        // Arrange
        Meats meat = new Meats("Salmon", true);

        // Act
        double ans = meat.getPrice("large");

        // Assert
        assertEquals(4.50, ans);
    }

    @Test
    public void getPrice_InvalidSize_ReturnsZero() {
        // Arrange
        Meats meat = new Meats("Salmon", false);

        // Act
        double ans = meat.getPrice("extra large");

        // Assert
        assertEquals(0.0, ans);
    }

    @Test
    public void getPrice_UppercaseSize_ReturnsCorrectPrice() {
        // Arrange
        Meats meat = new Meats("Salmon", true);

        // Act
        double ans = meat.getPrice("LARGE");

        // Assert
        assertEquals(4.50, ans);
    }
}