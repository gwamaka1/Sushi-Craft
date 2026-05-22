package com.pluarsight.models;

public class RegToppings extends Topping {
    public RegToppings(String name) {
        super(name);
    }

    @Override
    String getName() {
        return " ";
    }

    @Override
    String getDetails() {
        return " ";
    }

    @Override
    double getPrice(String size) {
        return 0;
    }


}
