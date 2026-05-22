package com.pluarsight.models;

import java.util.ArrayList;

public class CustomerPurchase {
    private ArrayList<IOrderItem> orderItems;

    public CustomerPurchase() {
        this.orderItems = new ArrayList<>();
    }
    public void addItem(IOrderItem item){

    }
    public double getTotal(){
        return 0;

    }
    public String getDetails(){
        return"";

    }
    public boolean isValidOrder(){
        return false;

    }
    public void getNewestItemsFirst(){

    }
}

