package com.pluarsight.models;

public class Drink implements IOrderItem {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }


    @Override
    public String getDetails() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
