package com.pluarsight.models;

public abstract class Topping {
    protected String name;

    public Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice(String size){
        return 0;
    };

    public String getDetails(){
        return " ";
    };
}
