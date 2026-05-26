package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @Test
    public void getSize_DrinkSize_ReturnsSize() {
        // Arrange
        Drink drink = new Drink("Large", "Sprite");

        // Act
        String ans = drink.getSize();

        // Assert
        assertEquals("Large", ans);
    }

    @Test
    public void getFlavor_DrinkFlavor_ReturnsFlavor() {
        // Arrange
        Drink drink = new Drink("Large", "Sprite");

        // Act
        String ans = drink.getFlavor();

        // Assert
        assertEquals("Sprite", ans);
    }

    @Test
    public void getPrice_SmallDrink_ReturnsTwoDollars() {
        // Arrange
        Drink drink = new Drink("Small", "Coke");

        // Act
        double ans = drink.getPrice();

        // Assert
        assertEquals(2.00, ans);
    }

    @Test
    public void getPrice_MediumDrink_ReturnsTwoDollarsAndFiftyCents() {
        // Arrange
        Drink drink = new Drink("Medium", "Sprite");

        // Act
        double ans = drink.getPrice();

        // Assert
        assertEquals(2.50, ans);
    }

    @Test
    public void getPrice_LargeDrink_ReturnsThreeDollars() {
        // Arrange
        Drink drink = new Drink("Large", "Lemonade");

        // Act
        double ans = drink.getPrice();

        // Assert
        assertEquals(3.00, ans);
    }

    @Test
    public void getPrice_InvalidSize_ReturnsZero() {
        // Arrange
        Drink drink = new Drink("Extra Large", "Sprite");

        // Act
        double ans = drink.getPrice();

        // Assert
        assertEquals(0.0, ans);
    }

    @Test
    public void getPrice_UppercaseSize_ReturnsCorrectPrice() {
        // Arrange
        Drink drink = new Drink("LARGE", "Sprite");

        // Act
        double ans = drink.getPrice();

        // Assert
        assertEquals(3.00, ans);
    }

    @Test
    public void getDetails_LargeSprite_ReturnsDrinkDetailsWithPrice() {
        // Arrange
        Drink drink = new Drink("Large", "Sprite");

        // Act
        String ans = drink.getDetails();

        // Assert
        assertEquals("Large Sprite Drink - $3.0", ans);
    }

    @Test
    public void getDetails_SmallCoke_ReturnsDrinkDetailsWithPrice() {
        // Arrange
        Drink drink = new Drink("Small", "Coke");

        // Act
        String ans = drink.getDetails();

        // Assert
        assertEquals("Small Coke Drink - $2.0", ans);
    }
}