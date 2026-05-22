package com.pluarsight.models;

public class Side extends Topping{
    public Side(String name) {
        super(name);
    }

    @Override
    String getName() {
        return "";
    }

    @Override
    public double getPrice(String size) {
        return 0.0;
    }

    @Override
    public String getDetails() {
        return " ";
    }
}
