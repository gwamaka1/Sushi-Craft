package com.pluarsight.models;

public class RegToppings extends Topping {
    public RegToppings(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDetails() {
        return " ";
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }


}
