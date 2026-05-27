package com.pluarsight.ui;

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
                    addShushitoCart();
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
    private void addShushitoCart(){
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



    }
    private void addDrinktoCart(){

    }
    private void addSideToCart(){

    }
    private void veiwCart(){

    }
    private void checkOut(){

    }
}
