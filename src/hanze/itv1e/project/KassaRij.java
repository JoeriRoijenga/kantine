package hanze.itv1e.project;

import java.util.*;

/**
 * Klasse KassaRij
 *
 * Deze klasse beheert alle eigenschappen van de kassarij.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
class KassaRij {

    /**
     * Private array met alle klanten in de rij.
     */
    private LinkedList<Persoon> mensenInDeRij;

    /**
     * Constructor
     */
    KassaRij() {
        mensenInDeRij = new LinkedList<>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant Nieuwe kant in de rij.
     */
    void sluitAchteraan(Persoon klant) {
        mensenInDeRij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    Persoon eerstePersoonInRij() {
        return mensenInDeRij.getFirst();
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    boolean erIsEenRij() {
        return mensenInDeRij.size() > 0;
    }

    /**
     * Verwijder de persoon die betaald heeft.
     */
    void verwijderPersoonInRij() {
        mensenInDeRij.removeFirst();
    }
}