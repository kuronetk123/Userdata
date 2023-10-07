package view;

import common.Validate;


public class View {
    public void displayMenu() {
        System.out.println("1. Create a new account.");
        System.out.println("2. Login system.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
Validate vd = new Validate();
    public String getInput() {
        return vd.checkInputString();
    }
}