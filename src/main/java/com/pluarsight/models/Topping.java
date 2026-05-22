package com.pluarsight.models;

public abstract class Topping  {
    private String name;

    public Topping(String name) {
        this.name = name;
    }






    abstract String getDetails();
    abstract String getName();
    abstract double getPrice(String size);
}
