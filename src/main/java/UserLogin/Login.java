package UserLogin;

import Exceptions.NoSuchMedlemException;

import java.sql.SQLException;

public interface Login {
    void login() throws SQLException, NoSuchMedlemException;
}
