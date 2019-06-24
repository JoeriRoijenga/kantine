package hanze.itv1e.project;

/**
 * Klasse KantineMedewerker
 *
 * Deze klasse beheert alle eigenschappen van de kantine medewerker.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class KantineMedewerker extends Persoon implements KortingskaartHouder {
    /**
     * Code van de medewerker.
     */
    private double medewerkerNummer;

    /**
     * Is de medewerker bevoegd voor de kassa.
     */
    private boolean kassaBevoegd;

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
    public KantineMedewerker(double medewerkerNummer, boolean kassaBevoegd, int BSN, String voornaam, String achternaam, String geslacht, int betaalwijze) {
        super(BSN, voornaam, achternaam, geslacht, betaalwijze);
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

    /**
     * Geeft de korting terug.
     * @return Het kortingspercentage
     */
    @Override
    public double geefKortingsPercentage() {
        return 30;
    }

    /**
     * Geeft aan of er een maximum is bij de korting.
     * @return Geeft een true of false terug.
     */
    @Override
    public boolean heeftMaximum() {
        return false;
    }

    /**
     * Geeft het maximum aan korting aan.
     * @return Het maximum van de korting.
     */
    @Override
    public double geefMaximum() {
        return 0;
    }
}
