package com.pluarsight.models;

public class SpringRoll implements IOrderItem {
    private String type;

    public SpringRoll( String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }

    @Override
    public String getDetails() {
        return "";
    }
}
