package hanze.itv1e.project;

import java.util.Arrays;

/**
 * Klasse Persoon
 *
 * Deze klasse beheert alle eigenschappen van de personen.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Persoon {
    /**
     * Private BSN in de vorm van een int.
     */
    private int BSN;

    /**
     * Private voornaam in de vorm van een string.
     */
    private String voornaam;

    /**
     * Private achternaam in de vorm van een string.
     */
    private String achternaam;

    /**
     * Private geboortedatum in de vorm van een datum.
     */
    private Datum geboorteDatum;

    /**
     * Private geslacht in de vorm van een geslacht.
     */
    private char geslacht;

    /**
     * Contructor voor de klasse Persoon.
     *
     * @param BSN Het BSN voor een nieuw persoon.
     * @param voornaam De voornaam voor een nieuw persoon.
     * @param achternaam De achternaam voor een nieuw persoon.
     * @param geboorteDatum De geboortedatum voor een nieuw persoon.
     * @param geslacht Het geslacht voor een nieuw persoon.
     */
    public Persoon(int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht) {
        setBSN(BSN);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboorteDatum(getInts(geboorteDatum));
        setGeslacht(geslacht);
    }

    /**
     * Default contructor voor de klasse Persoon.
     *
     * @param BSN Het BSN voor een nieuw persoon.
     * @param voornaam De voornaam voor een nieuw persoon.
     * @param achternaam De achternaam voor een nieuw persoon.
     */
    public Persoon(int BSN, String voornaam, String achternaam) {
        // Initialisatie
        setBSN(BSN);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboorteDatum();
    }

    private int[] getInts(String geboorteDatum) {
        int[] ints = new int[3];
        String[] strings = new String[3];

        strings = geboorteDatum.split("-");
        ints[0] = Integer.parseInt(strings[0]);
        ints[1] = Integer.parseInt(strings[1]);
        ints[2] = Integer.parseInt(strings[2]);

        return ints;
    }

    /**
     * Het ophalen van het BSN.
     * @return De waarde van het BSN.
     */
    public int getBSN() {
        return BSN;
    }

    /**
     * Het veranderen van het BSN.
     * @param BSN De nieuwe waarde voor het BSN.
     */
    public void setBSN(int BSN) {
        this.BSN = BSN;
    }

    /**
     * Het ophalen van de voornaam.
     * @return De waarde van de voornaam.
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Het veranderen van de achternaam.
     * @param voornaam De nieuwe waarde voor de achternaam.
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * Het ophalen van de achternaam.
     * @return De waarde van de achternaam.
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * Het veranderen van de achternaam.
     * @param achternaam De nieuwe waarde voor de achternaam.
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     * Het ophalen van de geboortedatum.
     * @return De waarde van de geboortedatum.
     */
    public String getGeboorteDatum() {
        return geboorteDatum.getDatumAsString();
    }

    /**
     * Het veranderen van de geboortedatum.
     * @param geboorteDatum De nieuwe waarde voor de geboortedatum.
     */
    public void setGeboorteDatum(int[] geboorteDatum) {
        if (geboorteDatum.length != 0) {
            this.geboorteDatum = new Datum(geboorteDatum[0], geboorteDatum[1], geboorteDatum[2]);
        }
    }

    /**
     * Het veranderen van de geboortedatum.
     */
    public void setGeboorteDatum() {
        this.geboorteDatum = new Datum();
    }

    /**
     * Het ophalen van het geslacht.
     * @return De waarde van het geslacht.
     */
    public String getGeslacht() {
        String geslacht = String.valueOf(this.geslacht);
        String returnValue = "Onbekend";

        if (geslacht.equals("M")) {
            returnValue = "Man";
        } else if (geslacht.equals("V")) {
            returnValue = "Vrouw";
        }

        return returnValue;
    }

    /**
     * Het veranderen van het geslacht.
     * @param geslacht De nieuwe waarde voor het geslacht.
     */
    public void setGeslacht(String geslacht) {
        if (!geslacht.equals("M") && !geslacht.equals("V")) {
            this.geslacht = "".charAt(0);
        }

        this.geslacht = geslacht.charAt(0);
    }

    /**
     * Een string van alle data.
     * @return String met alle nodige data.
     */
    public String toString() {
        return "Naam: " + getVoornaam() + " " + getAchternaam() + " BSN: " + getBSN() + " Geboortedatum: " + getGeboorteDatum() + " geslacht: " + getGeslacht();
    }
}
