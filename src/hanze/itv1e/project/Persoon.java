package hanze.itv1e.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
     * Private geslacht types in de vorm van een map.
     */
    private Map<String, String> geslachtTypes;

    /**
     * Private geslacht in de vorm van een int.
     */
    private String geslacht;

    /**
     * Private arraylist met de dienbladen.
     */
    private ArrayList<Dienblad> dienbladen;

    /**
     * Private dienblad met het huidige dienblad dat in gebruik is.
     */
    private Dienblad huidigDienblad;

    /**
     * Private betaalwijze hoe je wil betalen.
     */
    private Betaalwijze betaalwijze;

    /**
     * Contructor voor de klasse Persoon.
     *
     * @param BSN Het BSN voor een nieuw persoon.
     * @param voornaam De voornaam voor een nieuw persoon.
     * @param achternaam De achternaam voor een nieuw persoon.
     * @param geboorteDatum De geboortedatum voor een nieuw persoon.
     * @param geslacht Het geslacht voor een nieuw persoon.
     */
    Persoon(int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht, int betaalwijze) {
        setBSN(BSN);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboorteDatum(geboorteDatum);
        vulGeslacht();
        setGeslacht(geslacht);
        this.dienbladen = new ArrayList<>();
        setBetaalwijze(betaalwijze);
    }

    /**
     * Default contructor voor de klasse Persoon.
     *
     * @param BSN Het BSN voor een nieuw persoon.
     * @param voornaam De voornaam voor een nieuw persoon.
     * @param achternaam De achternaam voor een nieuw persoon.
     * @param betaalwijze De betaalwijze voor een nieuw persoon.
     */
    Persoon(int BSN, String voornaam, String achternaam, int betaalwijze) {
        // Initialisatie
        setBSN(BSN);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboorteDatum();
        vulGeslacht();
        setGeslacht("");
        this.dienbladen = new ArrayList<>();
        setBetaalwijze(betaalwijze);
    }

    /**
     * Het vullen van de geslachten mapping.
     */
    void vulGeslacht() {
        geslachtTypes = new HashMap<>();
        geslachtTypes.put("", "Onbekend");
        geslachtTypes.put("M", "Man");
        geslachtTypes.put("V", "Vrouw");
    }

    /**
     * Het ophalen van het BSN.
     * @return De waarde van het BSN.
     */
    private int getBSN() {
        return BSN;
    }

    /**
     * Het veranderen van het BSN.
     * @param BSN De nieuwe waarde voor het BSN.
     */
    private void setBSN(int BSN) {
        this.BSN = BSN;
    }

    /**
     * Het ophalen van de voornaam.
     * @return De waarde van de voornaam.
     */
    private String getVoornaam() {
        return voornaam;
    }

    /**
     * Het veranderen van de achternaam.
     * @param voornaam De nieuwe waarde voor de achternaam.
     */
    private void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * Het ophalen van de achternaam.
     * @return De waarde van de achternaam.
     */
    private String getAchternaam() {
        return achternaam;
    }

    /**
     * Het veranderen van de achternaam.
     * @param achternaam De nieuwe waarde voor de achternaam.
     */
    private void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     * Het ophalen van de geboortedatum.
     * @return De waarde van de geboortedatum.
     */
    private String getGeboorteDatum() {
        return geboorteDatum.toString();
    }

    /**
     * Het veranderen van de geboortedatum.
     * @param geboorteDatum De nieuwe waarde voor de geboortedatum.
     */
    private void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = new Datum(geboorteDatum);
    }

    /**
     * Het veranderen van de geboortedatum.
     */
    private void setGeboorteDatum() {
        this.geboorteDatum = new Datum();
    }

    /**
     * Het ophalen van het geslacht.
     * @return De waarde van het geslacht.
     */
    private String getGeslacht() {
        return geslachtTypes.get(geslacht);
    }

    /**
     * Het veranderen van het geslacht.
     * @param geslacht De nieuwe waarde voor het geslacht.
     */
    private void setGeslacht(String geslacht) {
        if (geslacht.equals("") || geslacht.equals("V") || geslacht.equals("M")) {
            this.geslacht = geslacht;
        }
    }

    /**
     * Pak een dienblad voor je artikelen.
     */
    void pakDienblad() {
        dienbladen.add(new Dienblad());
    }

    /**
     * Telt hoeveel dienbladen je hebt.
     * @return int met het aantal.
     */
    int telDienbladen() {
        return dienbladen.size();
    }

    /**
     * Kies een dienblad.
     * @param keuze Welk dienblad.
     */
    void kiesDienblad(int keuze) {
        huidigDienblad = dienbladen.get(keuze - 1);
    }

    /**
     * Voeg een artikel toe aan je dienblad.
     * @param artikel Het artikel dat je wil toevoegen.
     */
    void voegArtikelToe(Artikel artikel) {
        huidigDienblad.voegToe(artikel);
    }

    /**
     * Haal het aantal artikelen bij je dienblad op.
     * @return int aantal artikelen op het dienblad.
     */
    int aantalOpDienblad() {
        return huidigDienblad.getAantalArtikelen();
    }

    /**
     * Haal het huidige dienblad op.
     * @return het huidige dienblad.
     */
    Dienblad krijgDienblad() {
        if (huidigDienblad == null) {
            huidigDienblad = dienbladen.get(0);
        }
        return huidigDienblad;
    }

    /**
     * Verwijder het dienblad.
     */
    void verwijderDienblad() {
        dienbladen.remove(huidigDienblad);
        huidigDienblad = null;
    }

    /**
     * Een string van alle data.
     * @return String met alle nodige data.
     */
    public String toString() {
        return "Naam: " + getVoornaam() + " " + getAchternaam() + " BSN: " + getBSN() + " Geboortedatum: " + getGeboorteDatum() + " geslacht: " + getGeslacht();
    }

    /**
     * Geeft de betaalwijze terug.
     *
     * @return Betaalwijze
     */
    Betaalwijze getBetaalwijze() {
        return betaalwijze;
    }

    /**
     * Het zetten van de nieuwe betaalwijze.
     *
     * @param betaalwijze De nieuwe betaalwijze.
     */
    private void setBetaalwijze(int betaalwijze) {
        if (betaalwijze == 0) {
            this.betaalwijze = new Contant(40);
        } else if (betaalwijze == 1) {
            this.betaalwijze = new Pinpas(40, 10);
        }
    }
}
