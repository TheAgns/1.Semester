import Controller.MainController;
import Exceptions.NoSuchMedlemException;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, NoSuchMedlemException {
        MainController mainController = new MainController();
        mainController.runProgram();
    }
}
