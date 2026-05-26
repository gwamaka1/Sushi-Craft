package com.pluarsight.models;

public abstract class PremiumToppings extends Topping {
    protected boolean isExtra;

    public PremiumToppings(String name, boolean isExtra) {
        super(name);
        this.isExtra = isExtra;
    }

    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }

    @Override
    public String getDetails() {
        return " ";
    }
}
