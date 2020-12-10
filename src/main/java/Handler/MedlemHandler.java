package Handler;

import Domain.Medlemmer;
import Connection.JDBC;
import Exceptions.NoSuchMedlemException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedlemHandler {
    public Medlemmer getMedlemById(int id) throws SQLException, NoSuchMedlemException {
        Medlemmer retval = null;
        Connection connection = JDBC.getConnection();
        String query = "select medlem_id from medlem where medlem_id = " + id;
        PreparedStatement pS = connection.prepareStatement(query);

        if (retval == null) {
            throw new NoSuchMedlemException("Ingen ordre med id: " + id);
            }
            return retval;
        }
    }