package com.pluarsight.models;

import java.util.ArrayList;

public class CustomerPurchase {
    private ArrayList<IOrderItem> orderItems;

    public CustomerPurchase() {
        this.orderItems = new ArrayList<>();
    }
    public void addItem(IOrderItem item){
        orderItems.add(item);

    }
    public double getTotal(){
        double total= 0;
        for(IOrderItem item: orderItems){
            total+= item.getPrice();
        }
        return total;



    }
    public String getDetails(){
        String big = "";
        for(IOrderItem item: orderItems){
            big+= item.getDetails()+ "\n";
        }

        return big;

    }
    public boolean isValidOrder(){
        return !orderItems.isEmpty();

    }
    public ArrayList<IOrderItem> getNewestItemsFirst(){
        ArrayList<IOrderItem> newestFirst = new ArrayList<>();
        for(int i = orderItems.size()-1; i>=0; i--){
            newestFirst.add(orderItems.get(i));
        }
        return newestFirst;


    }
}

