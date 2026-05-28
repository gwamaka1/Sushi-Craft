package com.pluarsight.models;

import java.util.ArrayList;

public class CustomerPurchase {
    private ArrayList<IOrderItem> orderItems;

    public CustomerPurchase() {
        this.orderItems = new ArrayList<>();
    }
    public void addItem(IOrderItem item){
        if (item != null) {
            orderItems.add(item);
        }

    }
    public double getTotal(){
        double total= 0.00;
        for(IOrderItem item: orderItems){
            total+= item.getPrice();
        }
        return total;



    }
    public String getDetails(){
        String customerDetails = "";
        for(IOrderItem item: orderItems){
            customerDetails+= item.getDetails()+ "\n";
        }

        return customerDetails;

    }
    public boolean isValidOrder(){
        return !orderItems.isEmpty();

    }

}

