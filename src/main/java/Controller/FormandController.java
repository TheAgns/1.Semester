package Controller;

import Exceptions.NoSuchMedlemException;
import Handler.FormandHandler;
import UI.FormandMenu;

import java.sql.SQLException;
import java.util.Scanner;

public class FormandController {
    Scanner scanner = new Scanner(System.in);
FormandMenu formandMenu = new FormandMenu();
FormandHandler formandHandler = new FormandHandler();
    public FormandController() {
    }

    public void runProgram() throws SQLException, NoSuchMedlemException {
        int choice = 0;
        int exit = 9;
        while (choice != exit) {
            formandMenu.printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: formandHandler.visMedlemmer();
                    break;
                case 2: formandHandler.addMedlemmer();
                    break;
                case 3: formandHandler.fjernMedlemmer();
                    break;
                case 4:
                    break;

            }
        }
    }

}
