package com.pluarsight.models;

public class Side extends Topping{
    public Side(String name) {
        super(name);
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public double getPrice(String size) {

        return 0.0;
    }

    @Override
    public String getDetails() {
        return "Side: " + name;
    }
}
