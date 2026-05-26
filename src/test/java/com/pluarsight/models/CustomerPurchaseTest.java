package com.pluarsight.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerPurchaseTest {

    @Test
    public void isValidOrder_NewCustomerPurchaseWithNoItems_ReturnsFalse() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        // Act
        boolean ans = purchase.isValidOrder();

        // Assert
        assertFalse(ans);
    }

    @Test
    public void isValidOrder_CustomerPurchaseWithOneItem_ReturnsTrue() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();
        Drink drink = new Drink("Large", "Sprite");

        // Act
        purchase.addItem(drink);
        boolean ans = purchase.isValidOrder();

        // Assert
        assertTrue(ans);
    }

    @Test
    public void getTotal_CustomerPurchaseWithNoItems_ReturnsZero() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        // Act
        double ans = purchase.getTotal();

        // Assert
        assertEquals(0.0, ans);
    }

    @Test
    public void getTotal_CustomerPurchaseWithOneDrink_ReturnsDrinkPrice() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();
        Drink drink = new Drink("Large", "Sprite");

        // Act
        purchase.addItem(drink);
        double ans = purchase.getTotal();

        // Assert
        assertEquals(3.00, ans);
    }

    @Test
    public void getTotal_CustomerPurchaseWithDrinkAndSpringRoll_ReturnsTotalPrice() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();
        Drink drink = new Drink("Medium", "Coke");
        SpringRoll springRoll = new SpringRoll("Chicken");

        // Act
        purchase.addItem(drink);
        purchase.addItem(springRoll);
        double ans = purchase.getTotal();

        // Assert
        assertEquals(4.00, ans);
    }

    @Test
    public void getTotal_CustomerPurchaseWithSushiDrinkAndSpringRoll_ReturnsTotalPrice() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        Sushi sushi = new Sushi("Seaweed", "Large", false);
        sushi.addTopping(new Fish("Tuna", false));

        Drink drink = new Drink("Small", "Sprite");
        SpringRoll springRoll = new SpringRoll("Chicken");

        // Act
        purchase.addItem(sushi);
        purchase.addItem(drink);
        purchase.addItem(springRoll);

        double ans = purchase.getTotal();

        // Assert
        assertEquals(14.75, ans);
    }

    @Test
    public void getDetails_CustomerPurchaseWithNoItems_ReturnsEmptyString() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        // Act
        String ans = purchase.getDetails();

        // Assert
        assertEquals("", ans);
    }

    @Test
    public void getDetails_CustomerPurchaseWithOneDrink_ReturnsDrinkDetails() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();
        Drink drink = new Drink("Large", "Sprite");

        // Act
        purchase.addItem(drink);
        String ans = purchase.getDetails();

        // Assert
        assertEquals("Large Sprite Drink - $3.0\n", ans);
    }

    @Test
    public void getDetails_CustomerPurchaseWithDrinkAndSpringRoll_ReturnsBothItemDetails() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();
        Drink drink = new Drink("Medium", "Coke");
        SpringRoll springRoll = new SpringRoll("Chicken");

        // Act
        purchase.addItem(drink);
        purchase.addItem(springRoll);

        String ans = purchase.getDetails();

        // Assert
        assertEquals("Medium Coke Drink - $2.5\nChicken SpringRoll- $1.5\n", ans);
    }

    @Test
    public void getNewestItemsFirst_CustomerPurchaseWithNoItems_ReturnsEmptyList() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        // Act
        ArrayList<IOrderItem> ans = purchase.getNewestItemsFirst();

        // Assert
        assertEquals(0, ans.size());
    }

    @Test
    public void getNewestItemsFirst_CustomerPurchaseWithThreeItems_ReturnsItemsInReverseOrder() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        Drink drink = new Drink("Small", "Sprite");
        SpringRoll springRoll = new SpringRoll("Chicken");
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        purchase.addItem(drink);
        purchase.addItem(springRoll);
        purchase.addItem(sushi);

        // Act
        ArrayList<IOrderItem> ans = purchase.getNewestItemsFirst();

        // Assert
        assertEquals(sushi, ans.get(0));
        assertEquals(springRoll, ans.get(1));
        assertEquals(drink, ans.get(2));
    }

    @Test
    public void getNewestItemsFirst_CustomerPurchaseWithThreeItems_ReturnsSizeThree() {
        // Arrange
        CustomerPurchase purchase = new CustomerPurchase();

        Drink drink = new Drink("Small", "Sprite");
        SpringRoll springRoll = new SpringRoll("Chicken");
        Sushi sushi = new Sushi("Seaweed", "Large", false);

        // Act
        purchase.addItem(drink);
        purchase.addItem(springRoll);
        purchase.addItem(sushi);

        ArrayList<IOrderItem> ans = purchase.getNewestItemsFirst();

        // Assert
        assertEquals(3, ans.size());
    }
}