package hanze.itv1e.project;

public class Docent extends Persoon {
    public String docentCode;
    public String afdeling;

    public Docent(String docentCode, String afdeling, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht);
    }

    private String getAfdeling() {
        return afdeling;
    }

    private void setAfdeling(String afdeling) {
        this.afdeling = afdeling;
    }

    private String getDocentCode() {
        return docentCode;
    }

    private void setDocentCode(String docentCode) {
        this.docentCode = docentCode;
    }
}
