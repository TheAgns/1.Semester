package UserLogin;

import Controller.FormandController;
import Exceptions.NoSuchMedlemException;

import java.sql.SQLException;
import java.util.Scanner;

public class FormandLogin implements Login {
    FormandController formandController = new FormandController();
Scanner scanner = new Scanner(System.in);
String correctUsername = "f";
String correctPassword = "f";
String username = "";
String password = "";
    public void login() throws SQLException, NoSuchMedlemException {
        System.out.println("Hvad er dit brugernavn?");
        this.username = this.scanner.nextLine();
        System.out.println("Hvad er dit password?");
        this.password = this.scanner.nextLine();
        if (this.username.equals(this.correctUsername) && this.password.equals(this.correctPassword)) {
            this.formandController.runProgram();
            System.out.println("vi kom ind");
        } else {
            System.out.println("Forkert username eller password");
        }

    }
}
