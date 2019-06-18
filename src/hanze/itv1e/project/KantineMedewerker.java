package hanze.itv1e.project;

public class KantineMedewerker extends Persoon {
    public double medewerkerNummer;
    public boolean kassaBevoegd;

    /**
     * Constructor
     *
     * @param medewerkerNummer Nummer van de KantineMedewerker
     * @param kassaBevoegd Studierichting van de KantineMedewerker
     * @param BSN BSN van de KantineMedewerker
     * @param voornaam Voornaam van de KantineMedewerker
     * @param achternaam Achternaam van de KantineMedewerker
     * @param geboorteDatum Geboorte datum van de KantineMedewerker
     * @param geslacht Geslacht van de KantineMedewerker
     */
    public KantineMedewerker(double medewerkerNummer, boolean kassaBevoegd, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht);
    }

    /**
     * Constructor
     *
     * @param medewerkerNummer Nummer van de KantineMedewerker
     * @param kassaBevoegd Studierichting van de KantineMedewerker
     * @param BSN BSN van de KantineMedewerker
     * @param voornaam Voornaam van de KantineMedewerker
     * @param achternaam Achternaam van de KantineMedewerker
     */
    public KantineMedewerker(double medewerkerNummer, boolean kassaBevoegd, int BSN, String voornaam, String achternaam) {
        super(BSN, voornaam, achternaam);
    }

    /**
     *
     * @return
     */
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
