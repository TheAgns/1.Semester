package Handler;

import Data.ImportData;
import Connection.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class KassererHandler {
    ImportData importData = new ImportData();
    // henter medlemmer fra liste
    Scanner scanner;

    public void seRestance() throws SQLException {
        //List<Medlemmer> medlemmerList = importData.fillList();
        System.out.println("Medlemmer i restance: ");
        String query = "SELECT * FROM medlem WHERE medlem_balance < 0;";
        Connection connection = JDBC.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println("Medlems ID: " + resultSet.getInt("medlem_id") + ", " + "Navn: " +
                    resultSet.getString("navn") +
                    ", " + "Medlems Balance: " + resultSet.getInt("medlem_balance"));
        }
    }

    public void registrer() {
    }
}
