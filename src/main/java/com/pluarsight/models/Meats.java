package com.pluarsight.models;

public class Meats extends PremiumToppings {
    public Meats(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String getDetails() {
        if (isExtra) {
            return "Meats: Extra " + name;
        } else {
            return "Meats: " + name;
        }
    }

    @Override
    public double getPrice(String size) {
        double price = 0;
        if(size.equalsIgnoreCase("small")){
            price = 1.00;
            if(isExtra){
                price+= .5;
            }
        }
        else if(size.equalsIgnoreCase("medium")){
            price=2.00;
            if(isExtra){
                price+=1.00;
            }
        }
        else if(size.equalsIgnoreCase("large")){
            price =3.00;
            if (isExtra){
                price+=1.5;
            }
        }
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
