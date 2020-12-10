package Data;

import Domain.Medlemmer;
import Connection.JDBC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImportData {
    public static List<Medlemmer> fillList() throws SQLException {
        Medlemmer medlemmer = new Medlemmer();
        ExportData exportData = new ExportData();
        List<Medlemmer> medlemListe = new ArrayList<Medlemmer>();
        Statement stmt = null;
        ResultSet res = null;
        String sql = "SELECT * FROM delfin.medlem;";
        Connection con = JDBC.getConnection();
        stmt = con.createStatement();
        res = stmt.executeQuery(sql);
        while (res.next()) {

            String navn = res.getString("navn");
            int aargang = res.getInt("aargang");
            String status = res.getString("medlem_status");
            String gruppe = res.getString("medlem_gruppe");
            String type = res.getString("medlem_type");
            int balance = res.getInt("medlem_balance");
            String gender = res.getString("gender");
            int medlemId = res.getInt(1);
            medlemmer = new Medlemmer(medlemId,navn,aargang,status,gruppe,type,balance,gender);
            medlemListe.add(medlemmer);
        }
return medlemListe;
    }
}
