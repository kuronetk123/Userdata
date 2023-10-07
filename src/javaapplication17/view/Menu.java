package view;

import common.Validate;
import controller.Controller;


public class Menu extends View {
    private Controller controller;

    public Menu(Controller controller) {
        this.controller = controller;
    }
Validate vd = new Validate();
    public int getUserChoice() {
        return vd.checkInputIntLimit(1, 3);
    }

    public void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                controller.createNewAccount();
                break;
            case 2:
                controller.loginSystem();
                break;
            case 3:
                System.exit(0);
        }
    }
}
