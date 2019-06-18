package hanze.itv1e.project;

/**
 * Klasse Docent
 *
 * Deze klasse beheert alle eigenschappen van de docent.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Docent extends Persoon implements KortingskaartHouder {
    /**
     * String met de docent code.
     */
    private String docentCode;

    /**
     * String met de afdeling
     */
    private String afdeling;

    /**
     * Constructor
     *
     * @param docentCode Docenten code
     * @param afdeling Afdeling van de docent
     * @param BSN BSN van de docent
     * @param voornaam Voornaam van de docent
     * @param achternaam Achternaam van de docent
     * @param geboorteDatum Geboorte datum van de docent
     * @param geslacht Geslacht van de docent
     */
    Docent(String docentCode, String afdeling, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht, int betaalwijze) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht, betaalwijze);
        setAfdeling(afdeling);
        setDocentCode(docentCode);
    }

    /**
     * Constructor
     *
     * @param docentCode Docenten code
     * @param afdeling Afdeling van de docent
     * @param BSN BSN van de docent
     * @param voornaam Voornaam van de docent
     * @param achternaam Achternaam van de docent
     */
    Docent(String docentCode, String afdeling, int BSN, String voornaam, String achternaam, int betaalwijze) {
        super(BSN, voornaam, achternaam, betaalwijze);
        setAfdeling(afdeling);
        setDocentCode(docentCode);
    }

    /**
     * Geeft de afdeling van de docent terug.
     *
     * @return afdeling
     */
    private String getAfdeling() {
        return afdeling;
    }

    /**
     * Het zetten van de nieuwe afdeling.
     *
     * @param afdeling De nieuwe afdeling
     */
    private void setAfdeling(String afdeling) {
        this.afdeling = afdeling;
    }

    /**
     * Geeft de docent code terug.
     *
     * @return docentCode
     */
    private String getDocentCode() {
        return docentCode;
    }

    /**
     * Het zetten van een nieuwe docent code.
     *
     * @param docentCode De nieuwe code
     */
    private void setDocentCode(String docentCode) {
        this.docentCode = docentCode;
    }

    @Override
    public double geefKortingsPercentage() {
        return 20;
    }

    @Override
    public boolean heeftMaximum() {
        return true;
    }

    @Override
    public double geefMaximum() {
        return 10;
    }
}
