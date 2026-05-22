package com.pluarsight.models;

public class Meats extends PremiumToppings {
    public Meats(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public boolean isExtra() {
        return super.isExtra();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }

    @Override
    public double getPrice(String size) {
        return super.getPrice(size);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
