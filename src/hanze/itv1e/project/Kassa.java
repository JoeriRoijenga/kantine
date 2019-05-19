package hanze.itv1e.project;

/**
 * Klasse Dienblad
 *
 * Deze klasse beheert alle eigenschappen van het dienblad.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Kassa {
    /**
     * private int met het aantal producten die over de toonbank zijn gegaan.
     */
    private int aantal;

    /**
     * private double met het geld dat in de kassa zit.
     */
    private double geld;

    /**
     * Constructor
     */
    Kassa(KassaRij kassarij) {
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
    void rekenAf(Dienblad klant) {
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

    /**
     * Haalt het aantal producten over de toonbank op.
     * @return aantal
     */
    int getAantal() {
        return aantal;
    }

    /**
     * Het aantal producten over de toonbank aanpassen.
     * @param aantal Het nieuwe aantal producten.
     */
    private void setAantal(int aantal) {
        this.aantal = aantal;
    }

    /**
     * Haalt het geld op dat in de kassa zit.
     * @return geld
     */
    double getGeld() {
        return geld;
    }

    /**
     * Het geld dat in de kassa zit aanpassen.
     * @param geld Het nieuwe bedrag dat in de kassa zit.
     */
    private void setGeld(double geld) {
        this.geld = geld;
    }
}