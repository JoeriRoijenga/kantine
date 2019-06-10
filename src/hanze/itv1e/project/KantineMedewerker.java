package hanze.itv1e.project;

public class KantineMedewerker extends Persoon {
    public double medewerkerNummer;
    public boolean kassaBevoegd;

    public KantineMedewerker(double mederwerkerNummer, boolean kassaBevoegd, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht);
    }

    private boolean getKassaBevoegd() {
        return kassaBevoegd;
    }

    private void setKassaBevoegd(boolean kassaBevoegd) {
        this.kassaBevoegd = kassaBevoegd;
    }

    private double getMedewerkerNummer() {
        return medewerkerNummer;
    }

    private void setMedewerkerNummer(double medewerkerNummer) {
        this.medewerkerNummer = medewerkerNummer;
    }
}
