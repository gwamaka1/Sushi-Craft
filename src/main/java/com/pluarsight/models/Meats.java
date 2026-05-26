package com.pluarsight.models;

public class Meats extends PremiumToppings {
    public Meats(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String getDetails() {
        return " ";
    }

    @Override
    public double getPrice(String size) {
        return 0.0;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
