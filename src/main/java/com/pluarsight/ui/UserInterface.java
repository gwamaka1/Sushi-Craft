package com.pluarsight.ui;

import com.pluarsight.models.*;
import com.pluarsight.receipts.SaveReceipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private static final String RESET  = "\033[0m";
    private static final String RED    = "\033[31m";
    private static final String YELLOW = "\033[33m";
    private static final String CYAN   = "\033[36m";
    private static final String WHITE  = "\033[97m";
    private static final String BOLD   = "\033[1m";
    private static final String DIM    = "\033[2m";

    public UserInterface() {
        scanner = new Scanner(System.in);

    }

    public void display() {
        boolean quit = false;
        CustomerPurchase purchase = new CustomerPurchase();
        while (!quit) {
            System.out.print("\033[H\033[2J"); // clear screen
            System.out.flush();

            System.out.println(CYAN  + "  ╔═══════════════════════════════════════════╗" + RESET);
            System.out.println(CYAN  + "  ║                                           ║" + RESET);
            System.out.println(BOLD  + WHITE + "  ║   ███████╗██╗   ██╗███████╗██╗  ██╗██╗    ║" + RESET);
            System.out.println(BOLD  + WHITE + "  ║   ██╔════╝██║   ██║██╔════╝██║  ██║██║    ║" + RESET);
            System.out.println(BOLD  + WHITE + "  ║   ███████╗██║   ██║███████╗███████║██║    ║" + RESET);
            System.out.println(BOLD  + WHITE + "  ║   ╚════██║██║   ██║╚════██║██╔══██║██║    ║" + RESET);
            System.out.println(BOLD  + WHITE + "  ║   ███████║╚██████╔╝███████║██║  ██║██║    ║" + RESET);
            System.out.println(BOLD  + WHITE + "  ║   ╚══════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝    ║" + RESET);
            System.out.println(YELLOW + "  ║               ✦ C R A F T ✦              ║" + RESET);
            System.out.println(CYAN  + "  ║                                           ║" + RESET);
            System.out.println(CYAN  + "  ╚═══════════════════════════════════════════╝" + RESET);
            System.out.println();
            System.out.println(YELLOW + "  🍣  Fresh Rolls • Bold Flavors • Your Way  🍣" + RESET);
            System.out.println();
            System.out.println(CYAN  + "  ┌─────────────────────────────────────────┐" + RESET);
            System.out.println(CYAN  + "  │" + BOLD + WHITE + "            ~ MAIN MENU ~                " + RESET + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  ├─────────────────────────────────────────┤" + RESET);
            System.out.println(CYAN  + "  │  " + YELLOW + "[1]" + WHITE + "  🍱  Build Your Sushi Roll        " + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  │  " + YELLOW + "[2]" + WHITE + "  🥤  Add a Drink                  " + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  │  " + YELLOW + "[3]" + WHITE + "  🥢  Add a Side  (Spring Roll)    " + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  │  " + YELLOW + "[4]" + WHITE + "  🛒  View My Order                " + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  │  " + YELLOW + "[5]" + WHITE + "  💳  Checkout                     " + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  │  " + RED    + "[0]" + WHITE + "  🚪  Exit                         " + CYAN + "│" + RESET);
            System.out.println(CYAN  + "  └─────────────────────────────────────────┘" + RESET);
            System.out.println();
            System.out.print(YELLOW + "  ➤  Enter your choice: " + RESET);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    purchase.addItem(buildSushi());
                    ;
                    break;
                case "2":
                    purchase.addItem(buildDrink());
                    break;
                case "3":
                    purchase.addItem(springRollBuilder());
                case "4":
                    veiwCart(purchase);
                    break;
                case "5":
                    checkOut(purchase);
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);



            }


        }


    }

    private Sushi buildSushi() {
        String wrap = "";
        String size = "";
        // Ask for the wrap/base type
        System.out.println("What Type of Sushi do you want?");
        System.out.println("(1) white rice");
        System.out.println("(2) brown rice");
        System.out.println("(3) seaweed wrap");
        System.out.println("(4) soy paper roll");
        System.out.println("(0) to exit");

        System.out.println("Pick your choice");
        String choice;
        choice = scanner.nextLine();
        boolean isValid = false;
        // Keep asking until a valid wrap is chosen (or user exits)
        while (!isValid) {
            switch (choice) {
                case"0":
                    // Cancel the whole build
                    return null;

                case "1":
                    wrap = "White Rice";
                    isValid = true;
                    break;
                case "2":
                    wrap = "Brown Rice";
                    isValid = true;
                    break;
                case "3":
                    wrap = "seaweed wrap";
                    isValid = true;
                    break;
                case "4":
                    wrap = "Soy Paper Roll";
                    isValid = true;

                    break;
                default:
                    // Re-prompt on bad input
                    System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

                    choice = scanner.nextLine();
                    break;
            }
        }
        // Ask for the size (number of rolls)
        System.out.println("Whats the size do you want?\n" +
                "(1)4 rolls\n" +
                "(2)6 rolls\n" +
                "(3)8 rolls\n" +
                "(0) Exit");
        System.out.println("ENTER CHOICE HERE:");
        choice = scanner.nextLine();
        isValid = false;

        // Keep asking until a valid size is chosen (or user exits)
        while (!isValid) {
            switch (choice) {
                case"0":
                    // Cancel the whole build
                    return null;
                case "1":
                    size = "small";
                    isValid = true;
                    break;
                case "2":
                    size = "medium";
                    isValid = true;
                    break;
                case "3":
                    size = "large";
                    isValid = true;
                    break;
                default:
                    // Re-prompt on bad input
                    System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

                    choice = scanner.nextLine();
                    break;


            }
        }
        // Ask whether the roll should be fried
        System.out.println("Do you want sushi fried?\n" +
                "(1) yes\n" +
                "(2) no\n" +
                "(0) exit");
        choice = scanner.nextLine();
        boolean isFried = false;
        isValid = false;
// Keep asking until a valid yes/no is given (or user exits)
        while (!isValid) {
            if (choice.equalsIgnoreCase("1")) {
                // Yes — mark the roll as fried
                isFried = true;
                isValid = true;
            } else if (choice.equalsIgnoreCase("2")) {
                // No — leave the roll un-fried
                isFried = false;
                isValid = true;
            } else if(choice.equalsIgnoreCase("0")){
                // Cancel the whole build
                return null;
            }
            else {
                // Re-prompt on bad input
                System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

                choice = scanner.nextLine();
                break;

            }
        }
        //topping category
        HashMap<String, String> toppingCategories = new HashMap<>();
        toppingCategories.put("1", "regular toppings");
        toppingCategories.put("2", "Condiments");
        toppingCategories.put("3", "Meats");
        toppingCategories.put("4", "Fish");
        toppingCategories.put("5", "Complementary Side");
        toppingCategories.put("0", "Next");
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
        //connecting menu to category
        HashMap<String, HashMap<String, String>> categoryMenus = new HashMap<>();
        categoryMenus.put("1", regularToppings);
        categoryMenus.put("2", condimentOptions);
        categoryMenus.put("3", meatOptions);
        categoryMenus.put("4", fishOptions);
        categoryMenus.put("5", complementarySides);
        boolean quit = false;
// Create the sushi object now that base/size/fried are known
        Sushi sushi = new Sushi(wrap, size, isFried);
// Keep letting the user add toppings until they choose "Next" (0)
        while (!quit) {
            System.out.println("What toppings would you like?");
            // Print each topping category
            toppingCategories.entrySet().stream().forEach(entry -> System.out.println("(" + entry.getKey() + ") " + entry.getValue()));
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("0")) {
                // Done adding toppings
                quit = true;
            } else if (toppingCategories.containsKey(choice)) {
                // Show the options for the chosen category
                System.out.println("What would you like from " + toppingCategories.get(choice));
                HashMap<String, String> selectedMenu = categoryMenus.get(choice);

                // Print each option in the selected category
                selectedMenu.entrySet()
                        .stream()
                        .forEach(entry -> System.out.println("(" + entry.getKey() + ") " + entry.getValue()));

                System.out.println("Pick a topping:");
                String toppingChoice = scanner.nextLine();

                // Make sure the chosen topping exists in that category
                if (selectedMenu.containsKey(toppingChoice)) {
                    String toppingName = selectedMenu.get(toppingChoice);

                    // Create the correct topping type based on the category
                    switch (choice) {
                        case "1":
                            // Regular topping
                            sushi.addTopping(new RegToppings(toppingName));
                            break;

                        case "2":
                            // Condiment
                            sushi.addTopping(new Condiments(toppingName));
                            break;

                        case "3":
                            // Meat — ask if they want an extra portion
                            System.out.println("Do you want extra " + toppingName + "? y/n");
                            String extraMeatChoice = scanner.nextLine();
                            boolean extraMeat = extraMeatChoice.equalsIgnoreCase("y");

                            sushi.addTopping(new Meats(toppingName, extraMeat));
                            break;

                        case "4":
                            // Fish — ask if they want an extra portion
                            System.out.println("Do you want extra " + toppingName + "? y/n");
                            String extraFishChoice = scanner.nextLine();
                            boolean extraFish = extraFishChoice.equalsIgnoreCase("y");

                            sushi.addTopping(new Fish(toppingName, extraFish));
                            break;

                        case "5":
                            // Complementary side
                            sushi.addTopping(new Side(toppingName));
                            break;

                        default:
                            // Re-prompt on bad input
                            System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

                            break;
                    }

                    System.out.println(toppingName + " added.");
                } else {
                    // Topping number wasn't in the selected category
                    System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

                }

            }


        }
        System.out.println(YELLOW + "  ✔  Added to your order!" + RESET);
        return sushi;

    }

    // Walks the user through choosing a drink and size, returns the Drink
    private Drink buildDrink() {
        String size = "";
        String drink = " ";
        String choice = "";

        // Available drinks
        //Drink options
        HashMap<String, String> drinkOptions = new HashMap<>();
        drinkOptions.put("1", "Water");
        drinkOptions.put("2", "Sprite");
        drinkOptions.put("3", "Coke");
        drinkOptions.put("4", "Fanta");
        drinkOptions.put("5", "Lemonade");
        boolean isValid = false;
        // Keep asking until a valid drink is chosen (or user exits)
        while (!isValid) {
            drinkOptions.entrySet().stream().forEach(entry -> System.out.println("(" + entry.getKey() + ") " + entry.getValue()));
            System.out.println("Pick your drink or enter 0 to exit");
            choice = scanner.nextLine();
            if (drinkOptions.containsKey(choice)) {
                // Valid drink picked
                drink = drinkOptions.get(choice);
                isValid = true;
            } else if (choice.equalsIgnoreCase("0")) {
                // Cancel the build
                return null;
            } else{
                // Re-prompt on bad input
                System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);


            }
        }

        isValid = false;
        // Ask for the drink size
        System.out.println("Whats the size do you want?\n" +
                "(1)small\n" +
                "(2)medium\n" +
                "(3)large\n" +
                "(0)Exit");
        System.out.println("ENTER CHOICE HERE:");
        choice = scanner.nextLine();
        // Keep asking until a valid size is chosen (or user exits)
        while (!isValid) {
            switch (choice) {
                case"0":
                    // Cancel the build
                    return null;
                case "1":
                    size = "small";
                    isValid = true;
                    break;
                case "2":
                    size = "medium";
                    isValid = true;
                    break;
                case "3":
                    size = "large";
                    isValid = true;
                    break;
                default:
                    // Re-prompt on bad input
                    System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

                    choice = scanner.nextLine();
                    break;


            }
        }
        // Confirm the drink was added
        System.out.println(YELLOW + "  ✔  Added to your order!" + RESET);
        // Return the finished drink
        return new Drink(size, drink);


    }

    // Walks the user through choosing a spring roll type, returns the SpringRoll
    private SpringRoll springRollBuilder() {
        String choice = " ";
        String type = " ";
        // Available spring roll types
        HashMap<String, String> typeOfSpringRoll = new HashMap<>();
        typeOfSpringRoll.put("1", "Veggie");
        typeOfSpringRoll.put("2", "Chicken");
        boolean isValid = false;

        // Keep asking until a valid type is chosen (or user exits)
        while (!isValid) {
            System.out.println("What type of Spring roll do you want? or enter 0 to exit");
            typeOfSpringRoll.entrySet().stream().forEach(stringStringEntry -> System.out.println("(" + stringStringEntry.getKey()+ ") " + stringStringEntry.getValue()));
            choice = scanner.nextLine();
            if (typeOfSpringRoll.containsKey(choice)) {
                // Valid type picked
                type = typeOfSpringRoll.get(choice);
                isValid = true;


            } else if (choice.equalsIgnoreCase("0")) {
                // Cancel the build
                return null;
            } else {
                // Re-prompt on bad input
                System.out.println(RED + "  ✘  You need to pick an option, try again" + RESET);

            }


        }
        // Confirm the spring roll was added
        System.out.println(YELLOW + "  ✔  Added to your order!" + RESET);
        // Build and return the spring roll
        SpringRoll springRoll = new SpringRoll(type);
        return springRoll;
    }


    private void veiwCart(CustomerPurchase purchase) {
        if(!purchase.isValidOrder()){
            System.out.println("this order is empty");
            return;
        }
        System.out.println("========== CART ==========");
        System.out.println(purchase.getDetails());

        System.out.printf("Total: $%.2f%n", purchase.getTotal());
        System.out.println("==========================");

    }

    private void checkOut(CustomerPurchase purchase) {
        if (!purchase.isValidOrder()) {
            System.out.println(RED + "  ✘  Your order is empty." + RESET);
        } else {
            SaveReceipt saveReceipt = new SaveReceipt();
            saveReceipt.save(purchase);
            System.out.println(YELLOW + "  ✔  Order checked out! Receipt saved." + RESET);

        }
    }
}
