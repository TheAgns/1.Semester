package UserLogin;

import Controller.KassererController;
import Exceptions.NoSuchMedlemException;

import java.sql.SQLException;
import java.util.Scanner;

public class KassererLogin implements Login {
    KassererController kassererController = new KassererController();
    Scanner scanner;
    String correctUsername;
    String correctPassword;
    String username;
    String password;

    public KassererLogin() {
        this.scanner = new Scanner(System.in);
        this.correctUsername = "k";
        this.correctPassword = "k";
        this.username = "";
        this.password = "";
    }

    public void login() throws NoSuchMedlemException, SQLException {
        System.out.println("Hvad er dit brugernavn?");
        this.username = this.scanner.nextLine();
        System.out.println("Hvad er dit password?");
        this.password = this.scanner.nextLine();
        if (this.username.equals(this.correctUsername) && this.password.equals(this.correctPassword)) {
            this.kassererController.runProgram();
            System.out.println("vi kom ind");
        } else {
            System.out.println("Forkert username eller password");
        }

    }
}
