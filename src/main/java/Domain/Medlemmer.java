package Domain;

import Data.ExportData;
import Handler.FormandHandler;

public class Medlemmer {
    private int id;
    private int medlemsBalance;
    private int aargang;
    private String navn;
    private String medlemsStatus;
    private String medlemsGruppe;
    private String medlemsType;
    private String gender;

    public Medlemmer(int id, String navn, int aargang, String medlemsStatus, String medlemsGruppe, String medlemsType, int medlemsBalance, String gender) {
        this.id = id;
        this.medlemsBalance = medlemsBalance;
        this.aargang = aargang;
        this.navn = navn;
        this.medlemsStatus = medlemsStatus;
        this.medlemsGruppe = medlemsGruppe;
        this.medlemsType = medlemsType;
        this.gender = gender;
    }

    public Medlemmer() {
        this.id = id;
        this.medlemsBalance = medlemsBalance;
        this.aargang = aargang;
        this.navn = navn;
        this.medlemsStatus = medlemsStatus;
        this.medlemsGruppe = medlemsGruppe;
        this.medlemsType = medlemsType;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedlemsBalance() {
        return medlemsBalance;
    }

    public void setMedlemsBalance(int medlemsBalance) {
        this.medlemsBalance = medlemsBalance;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getMedlemsStatus() {
        return medlemsStatus;
    }

    public void setMedlemsStatus(String medlemsStatus) {
        this.medlemsStatus = medlemsStatus;
    }

    public String getMedlemsGruppe() {
        return medlemsGruppe;
    }

    public void setMedlemsGruppe(String medlemsGruppe) {
        this.medlemsGruppe = medlemsGruppe;
    }

    public String getMedlemsType() {
        return medlemsType;
    }

    public void setMedlemsType(String medlemsType) {
        this.medlemsType = medlemsType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Medlemmer{" +
                "id=" + id +
                ", medlemsBalance=" + medlemsBalance +
                ", aargang=" + aargang +
                ", navn='" + navn + '\'' +
                ", medlemsStatus='" + medlemsStatus + '\'' +
                ", medlemsGruppe='" + medlemsGruppe + '\'' +
                ", medlemsType='" + medlemsType + '\'' +
                ", gender='" + gender + '\n';
    }
}
