package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    public class JDBC {
        public static Connection getConnection() throws SQLException {
            String user = "root";
            String password = "Agnsgaard1998!";
            String url = "jdbc:mysql://localhost:3306/delfin";

            Connection connection = null;
            connection = DriverManager.getConnection(url, user, password);
            try {
                connection = DriverManager.getConnection(url, user, password);

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }

