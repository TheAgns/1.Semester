package Data;

import Connection.JDBC;
import Domain.Medlemmer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExportData {


    public int saveMedlem(Medlemmer medlemmer) throws SQLException {
        int medlemId = 0;
        ResultSet rs = null;
        Connection connection = JDBC.getConnection();
        String query = " INSERT INTO medlem (navn, aargang, medlem_status, medlem_gruppe, medlem_type, medlem_balance, gender)"
                + " values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, medlemmer.getNavn());
        preparedStatement.setInt(2, medlemmer.getAargang());
        preparedStatement.setString(3, medlemmer.getMedlemsStatus());
        preparedStatement.setString(4, medlemmer.getMedlemsGruppe());
        preparedStatement.setString(5, medlemmer.getMedlemsType());
        preparedStatement.setInt(6,medlemmer.getMedlemsBalance());
        preparedStatement.setString(7,medlemmer.getGender());
        preparedStatement.executeUpdate();
//TODO : fetch medlemId from order table
        rs = preparedStatement.getGeneratedKeys();
        if (rs.next()) {
            medlemId = rs.getInt(1);
        }
        return medlemId;
    }
}
