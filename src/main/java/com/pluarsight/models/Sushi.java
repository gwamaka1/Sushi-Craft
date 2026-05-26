package com.pluarsight.models;

import java.util.ArrayList;

public class Sushi implements IOrderItem{
    private String size;
    private String wrapType;
    private ArrayList<Topping> toppings;
    private boolean isFried;

    public Sushi(String wrapType, String size, boolean isFried) {
        this.wrapType = wrapType;
        this.size = size;
        this.isFried = isFried;
        this.toppings = new ArrayList<>();
    }
    public void addTopping(Topping topping1){
        toppings.add(topping1);


    }

    public String getSize() {
        return size;
    }

    public String getWrapType() {
        return wrapType;
    }

    public boolean isFried() {
        return isFried;
    }


    @Override
    public String getDetails() {
        String details = "";

        details += size + " Sushi";
        details += " with " + wrapType + " wrap";

        if (isFried) {
            details += ", fried";
        } else {
            details += ", not fried";
        }

        if (toppings.isEmpty()) {
            details += "\nToppings: none";
        } else {
            details += "\nToppings:";

            for (Topping topping : toppings) {
                details += "\n- " + topping.getDetails();
            }
        }

        details += "\nPrice: $" + getPrice();

        return details;
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        if(size.equalsIgnoreCase("small")){
            price = 3.5;


        }
        if(size.equalsIgnoreCase("medium")){
            price = 6.00;
        }
        if (size.equalsIgnoreCase("large")){
            price = 9.00;
        }
        for(Topping topping: toppings){
            price+= topping.getPrice(size);
        }
        return price;
    }


}
