package Controller;

import Exceptions.NoSuchMedlemException;
import UserLogin.FormandLogin;
import UserLogin.KassererLogin;
import UserLogin.TraenerLogin;

import java.sql.SQLException;
import java.util.Scanner;

public class MainController {
  FormandLogin formandLogin = new FormandLogin();
  KassererLogin kassererLogin = new KassererLogin();
  TraenerLogin traenerLogin = new TraenerLogin();
    int choice = 0;
    Scanner scanner;
    public MainController() {
        this.scanner = new Scanner(System.in);
    }

    public void runProgram() throws SQLException, NoSuchMedlemException {
        while(this.choice != 9) {
            System.out.println("Er du formand tast 1 kassere tast 2 træner tast 3");
            this.choice = this.scanner.nextInt();
            if (this.choice == 1) {
                this.formandLogin.login();
            } else if (this.choice == 2) {
                this.kassererLogin.login();
            } else if (this.choice == 3) {
                this.traenerLogin.login();
            } else {
                System.out.println("Vælg et gyldigt tal");
            }
        }

    }

}
