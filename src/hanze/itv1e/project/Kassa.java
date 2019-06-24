package hanze.itv1e.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

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

    private EntityManager manager;

    /**
     * Private kassarij met alle klanten.
     */
    private KassaRij kassarij;

    /**
     * Constructor
     */
    Kassa(KassaRij kassarij, EntityManager manager) {
        this.kassarij = kassarij;
        this.manager = manager;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    void rekenAf(Persoon klant) {
        Factuur factuur = new Factuur(klant, LocalDate.now());

        System.out.println(factuur);
        System.out.println();

        Betaalwijze betaalwijze = klant.getBetaalwijze();

        System.out.println("Gekregen korting: " + factuur.getKorting());
        EntityTransaction transaction = null;

        try {
            betaalwijze.betaal(factuur.getTotaal());

            setAantal(factuur.getAantal());
            setGeld(factuur.getTotaal());

            transaction = manager.getTransaction();
            transaction.begin();
            manager.persist(factuur);
            transaction.commit();

            klant.verwijderDienblad();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

            System.out.println(e);
        }
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
    void setAantal(int aantal) {
        this.aantal = this.aantal + aantal;
    }

    /**
     * Haalt het geld op dat in de kassa zit.
     * @return geld
     */
    double getGeld() {
        BigDecimal bd = new BigDecimal(geld).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Het geld dat in de kassa zit aanpassen.
     * @param geld Het nieuwe bedrag dat in de kassa zit.
     */
    void setGeld(double geld) {
        this.geld = this.geld + geld;
    }
}