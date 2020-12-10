package Handler;

import Data.ExportData;
import Data.ImportData;
import Domain.Medlemmer;
import Exceptions.NoSuchMedlemException;
import Connection.JDBC;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class FormandHandler {
    Scanner scanner;
    ExportData exportData = new ExportData();
    MedlemHandler medlemHandler = new MedlemHandler();

    public void visMedlemmer() throws SQLException {
        System.out.println(ImportData.fillList());

    }

    public void addMedlemmer() throws SQLException {
        Medlemmer medlemmer = new Medlemmer();
        int medlemsBalance = 0;
        int aargang = 0;
        String navn = "";

        //String medlemsStatus = "";
        //String medlemsGruppe = "";
        String medlemsType = "";
        String gender = "";
        int choice = 0;
        Date d = new Date();
        int currentYear = d.getYear() + 1900;
        int mebmerAge = currentYear - aargang;
        int age = 0;

        scanner = new Scanner(System.in);
        System.out.println("Nye medlems navn");
        navn = scanner.nextLine();
        medlemmer.setNavn(navn);

        System.out.println("Fødselsår");
        aargang = scanner.nextInt();
        medlemmer.setAargang(aargang);
        System.out.println();

        System.out.println("Køn: 1 for mand & 2 for kvinde");
        choice = scanner.nextInt();
        if (choice == 1) {
            medlemmer.setGender("Mand");
        } else if (choice == 2) {
            medlemmer.setGender("Kvinde");
        }

        System.out.println("Medlemsstatus: 1 for aktiv - 2 for passiv");
        choice = scanner.nextInt();
        if (choice == 1) {
            medlemmer.setMedlemsStatus("Aktiv");
        } else if (choice == 2) {
            medlemmer.setMedlemsStatus("Passiv");
        }
        age = currentYear - aargang;
        if (age >= 18) {
            medlemmer.setMedlemsGruppe("Senior");
        } else if (age < 18) {
            medlemmer.setMedlemsGruppe("Junior");
        }
        System.out.println("Medlemstype: 1 Motionistsvømmer & 2 for Konkurrencesvømmer");
        choice = scanner.nextInt();
        if (choice == 1) {
            medlemmer.setMedlemsType("Motionistsvømmer");
        } else if (choice == 2) {
            medlemmer.setMedlemsType("Konkurrencesvømmer");
        }
        int kontigentAktivUnder18 = 1000;
        int kontigentAktivOver18 = 1600;
        int kontigentAktivOver60 = 1600 / 100 * 75;
        int kontigentPassiv = 500;

        if (medlemmer.getMedlemsStatus().equals("Aktiv") && age < 18) {
            medlemsBalance -= kontigentAktivUnder18;
            medlemmer.setMedlemsBalance(medlemsBalance);
        } else if (medlemmer.getMedlemsStatus().equals("Aktiv") && age >= 18 && age < 60) {
            medlemsBalance -= kontigentAktivOver18;
            medlemmer.setMedlemsBalance(medlemsBalance);
        } else if (medlemmer.getMedlemsStatus().equals("Aktiv") && age >= 60) {
            medlemsBalance -= kontigentAktivOver60;
            medlemmer.setMedlemsBalance(medlemsBalance);
        } else if (medlemmer.getMedlemsStatus().equals("Passiv")) {
            medlemsBalance -= kontigentPassiv;
            medlemmer.setMedlemsBalance(medlemsBalance);
        }
        int medlemId = exportData.saveMedlem(medlemmer);
        medlemmer.setId(medlemId);

    }


    public void fjernMedlemmer() throws NoSuchMedlemException, SQLException {
        int choice = 0;
        scanner = new Scanner(System.in);
        System.out.println("Vælg medlem-id for at fjerne medlem");
        choice = scanner.nextInt();
        Connection connection = JDBC.getConnection();
        String query = "DELETE FROM medlem where medlem_id = " + choice + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        if (choice != 99) {
            try {
                //medlemHandler.getMedlemById(choice);
                //PreparedStatement pS = connection.prepareStatement(query);
                //pS.executeUpdate();
                preparedStatement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}
