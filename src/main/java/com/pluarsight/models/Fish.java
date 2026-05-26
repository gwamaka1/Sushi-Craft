package com.pluarsight.models;

public class Fish extends PremiumToppings{
    public Fish(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String getDetails() {
        return "Fish: "+ name;
    }

    @Override
    public double getPrice(String size) {
        double price = 0;
        if(size.equalsIgnoreCase("small")){
            price = .75;
            if(isExtra){
                price+= .3;
            }
        }
        else if(size.equalsIgnoreCase("medium")){
            price=1.50;
            if(isExtra){
                price+=.6;
            }
        }
        else if(size.equalsIgnoreCase("large")){
            price =2.25;
            if (isExtra){
                price+=.9;
            }
        }
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
