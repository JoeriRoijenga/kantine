package hanze.itv1e.project;

import java.text.DecimalFormat;

public class Kassa {

    private int aantal;
    private double geld;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        // method body omitted
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        System.out.println("Aantal artikelen:" + klant.getAantalArtikelen());
        System.out.println("Te betalen: " + klant.getTotaalPrijs());
        setAantal(getAantal() + klant.getAantalArtikelen());
        setGeld(getGeld() + klant.getTotaalPrijs());
    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return getAantal();
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return getGeld();
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        setAantal(0);
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public double getGeld() {
        return geld;
    }

    public void setGeld(double geld) {
        this.geld = geld;
    }
}