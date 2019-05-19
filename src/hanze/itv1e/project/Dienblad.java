package hanze.itv1e.project;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Klasse Dienblad
 *
 * Deze klasse beheert alle eigenschappen van het dienblad.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Dienblad {
    /**
     * Private array met alle artikelen op het dienblad.
     */
    private ArrayList<Artikel> artikelen;

    /**
     * Private klant in de vorm van het object persoon.
     */
    private Persoon klant;

    /**
     * Default constructor voor de klasse dienblad.
     */
    public Dienblad() {
        artikelen = new ArrayList<>();
    }

    /**
     * Contstuctor voor de klasse dienblad.
     * @param klant Klant variabele van het type Persoon.
     */
    Dienblad(Persoon klant) {
        artikelen = new ArrayList<>();
        setKlant(klant);
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    int getAantalArtikelen() {
        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    double getTotaalPrijs() {
        double prijs = 0;

        for (Artikel artikel : artikelen) {
            prijs += artikel.getPrijs();
        }

        BigDecimal bd = new BigDecimal(prijs).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Het ophalen van de klant.
     * @return De waarde van de klant.
     */
    Persoon getKlant() {
        return klant;
    }

    /**
     * Het veranderen van de klant.
     * @param klant De nieuwe waarde voor de klant.
     */
    private void setKlant(Persoon klant) {
        this.klant = klant;
    }
}

