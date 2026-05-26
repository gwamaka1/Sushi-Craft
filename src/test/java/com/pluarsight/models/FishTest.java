package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    @Test
    public void getName_FishName_ReturnsName() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        String ans = fish.getName();

        // Assert
        assertEquals("Tuna", ans);
    }

    @Test
    public void getDetails_FishName_ReturnsFishWithName() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        String ans = fish.getDetails();

        // Assert
        assertEquals("Fish: Tuna", ans);
    }

    @Test
    public void isExtra_FishIsExtra_ReturnsTrue() {
        // Arrange
        Fish fish = new Fish("Tuna", true);

        // Act
        boolean ans = fish.isExtra();

        // Assert
        assertTrue(ans);
    }

    @Test
    public void isExtra_FishIsNotExtra_ReturnsFalse() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        boolean ans = fish.isExtra();

        // Assert
        assertFalse(ans);
    }

    @Test
    public void getPrice_SmallNotExtra_ReturnsSeventyFiveCents() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        double ans = fish.getPrice("small");

        // Assert
        assertEquals(0.75, ans);
    }

    @Test
    public void getPrice_SmallExtra_ReturnsOneDollarAndFiveCents() {
        // Arrange
        Fish fish = new Fish("Tuna", true);

        // Act
        double ans = fish.getPrice("small");

        // Assert
        assertEquals(1.05, ans);
    }

    @Test
    public void getPrice_MediumNotExtra_ReturnsOneDollarAndFiftyCents() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        double ans = fish.getPrice("medium");

        // Assert
        assertEquals(1.50, ans);
    }

    @Test
    public void getPrice_MediumExtra_ReturnsTwoDollarsAndTenCents() {
        // Arrange
        Fish fish = new Fish("Tuna", true);

        // Act
        double ans = fish.getPrice("medium");

        // Assert
        assertEquals(2.10, ans);
    }

    @Test
    public void getPrice_LargeNotExtra_ReturnsTwoDollarsAndTwentyFiveCents() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        double ans = fish.getPrice("large");

        // Assert
        assertEquals(2.25, ans);
    }

    @Test
    public void getPrice_LargeExtra_ReturnsThreeDollarsAndFifteenCents() {
        // Arrange
        Fish fish = new Fish("Tuna", true);

        // Act
        double ans = fish.getPrice("large");

        // Assert
        assertEquals(3.15, ans);
    }

    @Test
    public void getPrice_InvalidSize_ReturnsZero() {
        // Arrange
        Fish fish = new Fish("Tuna", false);

        // Act
        double ans = fish.getPrice("extra large");

        // Assert
        assertEquals(0.0, ans);
    }

    @Test
    public void getPrice_UppercaseSize_ReturnsCorrectPrice() {
        // Arrange
        Fish fish = new Fish("Tuna", true);

        // Act
        double ans = fish.getPrice("LARGE");

        // Assert
        assertEquals(3.15, ans);
    }
}