package com.pluarsight.models;

public class Condiments extends Topping{
    public Condiments(String name) {
        super(name);
    }

    @Override
    String getName() {
        return "";
    }

    @Override
    double getPrice(String size) {
        return 0;
    }

    @Override
    String getDetails() {
        return " ";
    }
}
