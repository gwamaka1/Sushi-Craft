package com.pluarsight.models;

public abstract class PremiumToppings extends Topping {
    private boolean isExtra;

    public PremiumToppings(String name, boolean isExtra) {
        super(name);
        this.isExtra = isExtra;
    }

    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice(String size) {
        return super.getPrice(size);
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}
