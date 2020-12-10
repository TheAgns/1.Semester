package Controller;

import Exceptions.NoSuchMedlemException;
import Handler.KassererHandler;
import UI.KassererMenu;

import java.sql.SQLException;
import java.util.Scanner;

public class KassererController {
    Scanner scanner = new Scanner(System.in);
    KassererMenu kassererMenu = new KassererMenu();
    KassererHandler kassererHandler = new KassererHandler();

    public KassererController() {
    }

    public void runProgram() throws SQLException, NoSuchMedlemException {
        int choice = 0;
        int exit = 9;
        while (choice != exit) {
            kassererMenu.printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    kassererHandler.seRestance();
                    break;
                case 2:
                    kassererHandler.registrer();
                    break;
            }
        }
    }
}
