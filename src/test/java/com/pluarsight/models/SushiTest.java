package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SushiTest {

    @Test
    public void getSize_SushiSize_ReturnsSize() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        // Act
        String ans = sushi.getSize();

        // Assert
        assertEquals("Large", ans);
    }

    @Test
    public void getWrapType_SushiWrapType_ReturnsWrapType() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        // Act
        String ans = sushi.getWrapType();

        // Assert
        assertEquals("Seaweed", ans);
    }

    @Test
    public void isFried_SushiIsFried_ReturnsTrue() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", true);

        // Act
        boolean ans = sushi.isFried();

        // Assert
        assertTrue(ans);
    }

    @Test
    public void isFried_SushiIsNotFried_ReturnsFalse() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        // Act
        boolean ans = sushi.isFried();

        // Assert
        assertFalse(ans);
    }

    @Test
    public void getPrice_SmallSushiWithNoToppings_ReturnsThreeDollarsAndFiftyCents() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Small", false);

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(3.50, ans);
    }

    @Test
    public void getPrice_MediumSushiWithNoToppings_ReturnsSixDollars() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Medium", false);

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(6.00, ans);
    }

    @Test
    public void getPrice_LargeSushiWithNoToppings_ReturnsNineDollars() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(9.00, ans);
    }

    @Test
    public void getPrice_SushiWithRegularTopping_ReturnsBasePriceOnly() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new RegToppings("Cucumber"));

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(9.00, ans);
    }

    @Test
    public void getPrice_LargeSushiWithFishTopping_ReturnsBasePricePlusFishPrice() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new Fish("Tuna", false));

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(11.25, ans);
    }

    @Test
    public void getPrice_LargeSushiWithExtraFishTopping_ReturnsBasePricePlusExtraFishPrice() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new Fish("Tuna", true));

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(12.15, ans);
    }

    @Test
    public void getPrice_MediumSushiWithMeatTopping_ReturnsBasePricePlusMeatPrice() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Medium", false);
        sushi.addTopping(new Meats("Chicken", false));

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(8.00, ans);
    }

    @Test
    public void getPrice_MediumSushiWithExtraMeatTopping_ReturnsBasePricePlusExtraMeatPrice() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Medium", false);
        sushi.addTopping(new Meats("Chicken", true));

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(9.00, ans);
    }

    @Test
    public void getPrice_LargeSushiWithMultipleToppings_ReturnsTotalPrice() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new RegToppings("Cucumber"));
        sushi.addTopping(new Fish("Tuna", false));
        sushi.addTopping(new Meats("Chicken", true));

        // Act
        double ans = sushi.getPrice();

        // Assert
        assertEquals(15.75, ans);
    }

    @Test
    public void getDetails_SushiWithNoToppings_ReturnsDetailsWithNoToppings() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        // Act
        String ans = sushi.getDetails();

        // Assert
        assertEquals("Large Sushi with Seaweed wrap, not fried\nToppings: none\nPrice: $9.0", ans);
    }

    @Test
    public void getDetails_FriedSushiWithNoToppings_ReturnsDetailsWithFried() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Small", true);

        // Act
        String ans = sushi.getDetails();

        // Assert
        assertEquals("Small Sushi with Seaweed wrap, fried\nToppings: none\nPrice: $3.5", ans);
    }

    @Test
    public void getDetails_SushiWithRegularTopping_ReturnsDetailsWithTopping() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new RegToppings("Cucumber"));

        // Act
        String ans = sushi.getDetails();

        // Assert
        assertEquals("Large Sushi with Seaweed wrap, not fried\nToppings:\n- Regular Topping: Cucumber\nPrice: $9.0", ans);
    }

    @Test
    public void getDetails_SushiWithMultipleToppings_ReturnsDetailsWithAllToppings() {
        // Arrange
        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new RegToppings("Cucumber"));
        sushi.addTopping(new Fish("Tuna", false));
        sushi.addTopping(new Meats("Chicken", true));

        // Act
        String ans = sushi.getDetails();

        // Assert
        assertEquals("Large Sushi with Seaweed wrap, not fried\nToppings:\n- Regular Topping: Cucumber\n- Fish: Tuna\n- Meats: Chicken\nPrice: $15.75", ans);
    }
}