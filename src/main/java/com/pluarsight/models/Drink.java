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

        return size + " " + flavor + " Drink - $" + getPrice();
    }

    @Override
    public double getPrice() {
        if (size.equalsIgnoreCase("Small")){
            return 2.00;
        }
        else if(size.equalsIgnoreCase("Medium")){
            return 2.50;
        } else if (size.equalsIgnoreCase("Large")) {
            return 3.00;

        }
        else return 0;

    }
}
