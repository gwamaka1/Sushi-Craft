package com.pluarsight.models;

import java.util.ArrayList;

public class Sushi implements IOrderItem{
    private String size;
    private String wrapType;
    private ArrayList<Topping> topping;
    private boolean isFried;

    public Sushi(String wrapType, String size, boolean isFried) {
        this.wrapType = wrapType;
        this.size = size;
        this.isFried = isFried;
        this.topping = new ArrayList<>();
    }
    public void addTopping(){

    }

    public String getSize() {
        return size;
    }

    public String getWrapType() {
        return wrapType;
    }

    public boolean isFried() {
        return isFried;
    }

    public Sushi() {
        super();
    }

    @Override
    public String getDetails() {
        return "";
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }


}
