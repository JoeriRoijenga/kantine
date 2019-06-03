package hanze.itv1e.project;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

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
    private Stack<Artikel> artikelen;

    /**
     * Contstuctor voor de klasse dienblad.
     */
    Dienblad() {
        artikelen = new Stack<>();
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    void voegToe(Artikel artikel) {
        artikelen.push(artikel);
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
}

