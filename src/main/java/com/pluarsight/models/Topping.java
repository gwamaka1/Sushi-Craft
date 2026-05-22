package com.pluarsight.models;

public abstract class Topping  {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String getDetails(){
        return "";
    };
    public double getPrice(String size){
        return 0;
    };
}
