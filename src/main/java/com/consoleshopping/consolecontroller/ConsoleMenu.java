package com.consoleshopping.consolecontroller;

import com.consoleshopping.intemcontroller.AItem;
import com.consoleshopping.productcontroller.Items;
import com.consoleshopping.utils.InputHandler;

import java.util.List;

public class ConsoleMenu extends AMenu implements MenuActions {


    public ConsoleMenu() {
        menu();
    }

    @Override
    public void welcomeMenu() {
        System.out.println(" ");
        System.out.println("Select any key below:");
        System.out.println("1. Show Store Products");
        System.out.println("2. Display Cart");
        System.out.println("3. Exit");
    }

    @Override
    public void actionWithItemsMenu() {
        System.out.println(" ");
        System.out.println("Select any key below:");
        System.out.println("1. Add item to Cart");
        System.out.println("2. Remove item from Cart");
        System.out.println("3. Return to first screen");
        System.out.println("4. Exit");
    }

    @Override
    public void displayItems() {
        List<AItem> aItemList = new Items().getProductList();

        for (AItem aItem : aItemList) {
            if (aItem == null) {
                break;
            }
            System.out.println(aItem);
        }
    }

    @Override
    public void addItemToCart() {
        System.out.println("Enter item pID to add: ");
        int pID = InputHandler.readUserInput();
        userCart.addItemToCardByID(pID);
    }

    @Override
    public void removeItemFromCart() {
        System.out.println("Enter item pID to delete: ");
        int pID = InputHandler.readUserInput();
        userCart.removeItemByID(pID);
        displayCartItems();
        menu();
    }

    @Override
    public void displayCartItems() {
        System.out.println("Your current cart items: ");
        userCart.showCartItems();
    }

    public void menu () {
        do {
            welcomeMenu();
            int input = InputHandler.readUserInput();

            switch (input) {
                case 1:
                    displayItems();
                    actionWithItemsMenu();
                    int caseOneInput = InputHandler.readUserInput();
                    secondOption(caseOneInput);
                    break;
                case 2:
                    displayCartItems();
                    menu();
                    int caseTwoInput = InputHandler.readUserInput();
                    secondOption(caseTwoInput);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (true);
    }

    private void secondOption(int input) {
        switch (input) {
            case 1:
                addItemToCart();
                displayCartItems();
                menu();
                break;
            case 2:
                removeItemFromCart();
                break;
            case 3:
                menu();
            case 4:
                System.exit(0);
            default:

                break;
        }
    }
}
