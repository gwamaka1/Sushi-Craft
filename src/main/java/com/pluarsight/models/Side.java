package com.pluarsight.models;

public class Side extends Topping{
    public Side(String name) {
        super(name);
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
