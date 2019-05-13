public class Persoon {
    private int BSN;
    private String voornaam;
    private String achternaam;
    private Datum geboorteDatum;
    private char geslacht;

    public Persoon(int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht) {
        this.BSN = BSN;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        //this.geboorteDatum = geboorteDatum;
        setGeslacht(geslacht);
    }

    public int getBSN() {
        return BSN;
    }

    public void setBSN(int BSN) {
        this.BSN = BSN;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Datum getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Datum geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public char getGeslacht() {
        return geslacht;
    }

    public boolean setGeslacht(String geslacht) {
        if (!geslacht.equals("M") && !geslacht.equals("V")) {
            return false;
        }

        this.geslacht = geslacht.charAt(0);
        return true;
    }
}
