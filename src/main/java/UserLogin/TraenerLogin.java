package UserLogin;

import Controller.TraenerController;

import java.util.Scanner;

public class TraenerLogin implements Login {
    TraenerController traenerController = new TraenerController();
    Scanner scanner;
    String correctUsername;
    String correctPassword;
    String username;
    String password;

    public TraenerLogin() {
        this.scanner = new Scanner(System.in);
        this.correctUsername = "traener";
        this.correctPassword = "traener123";
        this.username = "";
        this.password = "";
    }

    public void login() {
        System.out.println("Hvad er dit brugernavn?");
        this.username = this.scanner.nextLine();
        System.out.println("Hvad er dit password?");
        this.password = this.scanner.nextLine();
        if (this.username.equals(this.correctUsername) && this.password.equals(this.correctPassword)) {
            this.traenerController.runProgram();
            System.out.println("vi kom ind");
        } else {
            System.out.println("Forkert username eller password");
        }

    }
}
