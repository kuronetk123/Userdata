package common;

import controller.Controller;
import view.Menu;
import view.View;


public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        Menu menu = new Menu(controller);

        while (true) {
            view.displayMenu();
            int choice = menu.getUserChoice();
            menu.processUserChoice(choice);
        }
    }
}