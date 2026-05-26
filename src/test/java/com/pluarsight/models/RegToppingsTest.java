package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegToppingsTest {

    @Test
    public void getName_RegularToppingName_ReturnsName() {
        // Arrange
        RegToppings topping = new RegToppings("Cucumber");

        // Act
        String ans = topping.getName();

        // Assert
        assertEquals("Cucumber", ans);
    }

    @Test
    public void getDetails_RegularToppingName_ReturnsRegularToppingWithName() {
        // Arrange
        RegToppings topping = new RegToppings("Cucumber");

        // Act
        String ans = topping.getDetails();

        // Assert
        assertEquals("Regular Topping: Cucumber", ans);
    }

    @Test
    public void getPrice_LargeSize_ReturnsZero() {
        // Arrange
        RegToppings topping = new RegToppings("Cucumber");

        // Act
        double ans = topping.getPrice("Large");

        // Assert
        assertEquals(0.0, ans);
    }

    @Test
    public void getPrice_SmallSize_ReturnsZero() {
        // Arrange
        RegToppings topping = new RegToppings("Avocado");

        // Act
        double ans = topping.getPrice("Small");

        // Assert
        assertEquals(0.0, ans);
    }
}