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
    public KantineMedewerker(double medewerkerNummer, boolean kassaBevoegd, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht, int betaalwijze) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht, betaalwijze);
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
    public KantineMedewerker(double medewerkerNummer, boolean kassaBevoegd, int BSN, String voornaam, String achternaam, int betaalwijze) {
        super(BSN, voornaam, achternaam, betaalwijze);
    }

    /**
     * returns de kassabevoegdheid van de medewerker
     * @return kassabevoegdheid
     */
    private boolean getKassaBevoegd() {
        return kassaBevoegd;
    }

    /**
     * set de kassabevoegdheid van de medewerker
     * @param kassaBevoegd kassabevoegdheid
     */
    private void setKassaBevoegd(boolean kassaBevoegd) {
        this.kassaBevoegd = kassaBevoegd;
    }

    /**
     * returns het nummer van de medewerker
     * @return medewerkernummer
     */
    private double getMedewerkerNummer() {
        return medewerkerNummer;
    }

    /**
     * zet het medewerkernummer
     * @param medewerkerNummer nummer van de medewerker
     */
    private void setMedewerkerNummer(double medewerkerNummer) {
        this.medewerkerNummer = medewerkerNummer;
    }
}
