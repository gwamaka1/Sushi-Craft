package com.pluarsight.ui;

import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    public UserInterface(){
        scanner = new Scanner(System.in);
    }
    public void display(){
        boolean quit = false;
        while (!quit){
            System.out.println("WELCOME TO SUSHI CRAFT");
            System.out.println("-----------------------");
            System.out.println("(1)ADD SUSHI");
            System.out.println("(2)ADD DRINK");
            System.out.println("(3)ADD SIDE(SPRING ROLL");
            System.out.println("(4)VIEW ORDER");
            System.out.println("(5)CHECKOUT");
            System.out.println("(0)EXIT");

            System.out.println("ENTER YOUR CHOICE:");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    addShushiToCart();
                    break;
                case "2":
                    addDrinktoCart();
                    break;
                case "3":
                    addSideToCart();
                case "4":
                    veiwCart();
                    break;
                case "5":
                    checkOut();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("You need to pick an option, try again");


            }





        }


    }
    private void addShushiToCart(){
        /*
        -white rice
-brown rice
-seaweed wrap
-soy paper roll
         */
        System.out.println("What Type of Sushi do you want?");
        System.out.println("(1) white rice");
        System.out.println("(2) brown rice");
        System.out.println("(3) seaweed wrap");
        System.out.println("(4) soy paper roll");

        System.out.println("Pick your choice");
        String wrap;
        String choice;
        choice= scanner.nextLine();
        boolean isValid = false;
        while(!isValid) {
            switch (choice) {
                case "1":
                    wrap = "White Rice";
                    isValid =true;
                    break;
                case "2":
                    wrap = "Brown Rice";
                    isValid = true;
                    break;
                case "3":
                    wrap = "seaweed wrap";
                    isValid =true;
                    break;
                case "4":
                    wrap = "Soy Paper Roll";
                    isValid =true;

                    break;
                default:
                    System.out.println("not a valid choice,try again");
            }
        }
        System.out.println("Whats the size do you want?\n" +
                "(1)4 rolls\n" +
                "(2)6 rolls\n" +
                "(3)8 rolls\n");
        System.out.println("ENTER CHOICE HERE:");
        choice= scanner.nextLine();
        String size;

        while(!isValid) {
            switch (choice) {
                case"1":
                    size ="small";
                    isValid = true;
                    break;
                case"2":
                    size ="medium";
                    isValid = true;
                    break;
                case"3":
                    size = "large";
                    isValid = true;
                    break;
                default:
                    System.out.println("not a valid answer try again");





            }
        }
        System.out.println("Do you want sushi fried?\n" +
                "(1) yes\n" +
                "(2) no");
        choice = scanner.nextLine();
        boolean isFried;
       while(!isValid) {
           if (choice.equalsIgnoreCase("1")) {
               isFried = true;
               isValid =true;
           } else if (choice.equalsIgnoreCase("2")) {
               isFried = false;
               isValid =true;
           } else {
               System.out.println("invalid choice try again");

           }
       }
       //topping category
       HashMap<String,String> toppingCategories = new HashMap<>();
       toppingCategories.put("1","regular toppings");
       toppingCategories.put("2", "Condiments");
       toppingCategories.put("3", "Meats");
       toppingCategories.put("4", "Fish");
       toppingCategories.put("5", "Complementary Side");
       toppingCategories.put("0", "None");
       // fish category
        HashMap<String, String> fishOptions = new HashMap<>();

        fishOptions.put("1", "Salmon");
        fishOptions.put("2", "Eel");
        fishOptions.put("3", "Shrimp");
        fishOptions.put("4", "Tuna");
        fishOptions.put("5", "Spicy Tuna");
        fishOptions.put("6", "Squid");
        //Meat category

        HashMap<String, String> meatOptions = new HashMap<>();
        meatOptions.put("1", "Beef");
        meatOptions.put("2", "Pork");
        meatOptions.put("3", "Duck");
        meatOptions.put("4", "Chicken");
        //Condiments category
        HashMap<String, String> condimentOptions = new HashMap<>();
        condimentOptions.put("1", "Soy Sauce");
        condimentOptions.put("2", "Spicy Mayo");
        condimentOptions.put("3", "Eel Sauce");
        condimentOptions.put("4", "Yum Yum Sauce");
        condimentOptions.put("5", "Teriyaki");
        condimentOptions.put("6", "Ponzu Sauce");
        //Regular Topping category
        HashMap<String, String> regularToppings = new HashMap<>();

        regularToppings.put("1", "Cucumber");
        regularToppings.put("2", "Avocado");
        regularToppings.put("3", "Carrots");
        regularToppings.put("4", "Lettuce");
        regularToppings.put("5", "Jalapeños");
        regularToppings.put("6", "Green onions");
        regularToppings.put("7", "Red cabbage");
        regularToppings.put("8", "Pickled ginger");
        //complementary side
        HashMap<String, String> complementarySides = new HashMap<>();
        complementarySides.put("1", "Wasabi");
        complementarySides.put("2", "Gari");

       boolean quit = false;
       while(!quit){
        System.out.println("What toppings would you like?");
        toppingCategories.entrySet().stream().forEach(entry -> System.out.println("("+entry.getKey()+") "+ entry.getValue()));
        choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("0")){
            quit = true;
        }
        else if(toppingCategories.containsKey(choice)){

        }




    }}
    private void addDrinktoCart(){

    }
    private void addSideToCart(){

    }
    private void veiwCart(){

    }
    private void checkOut(){

    }
}
