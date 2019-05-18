package hanze.itv1e.project;

import java.util.ArrayList;

public class Dienblad {
    private ArrayList<Artikel> artikelen;
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
    public Dienblad(Persoon klant) {
        artikelen = new ArrayList<>();
        setKlant(klant);
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        int prijs = 0;

        for (Artikel artikel : artikelen) {
            prijs += artikel.getPrijs();
        }

        return prijs;
    }

    /**
     * Het ophalen van de klant.
     * @return De waarde van de klant.
     */
    public Persoon getKlant() {
        return klant;
    }

    /**
     * Het veranderen van de klant.
     * @param klant De nieuwe waarde voor de klant.
     */
    public void setKlant(Persoon klant) {
        this.klant = klant;
    }
}

