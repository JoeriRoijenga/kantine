package hanze.itv1e.project;

import java.util.ArrayList;

/**
 * Klasse KassaRij
 *
 * Deze klasse beheert alle eigenschappen van de kassarij.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class KassaRij {

    /**
     * Private array met alle dienbladen/klanten in de rij.
     */
    private ArrayList<Dienblad> mensenInDeRij;

    /**
     * Constructor
     */
    KassaRij() {
        mensenInDeRij = new ArrayList<>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant Nieuwe kant in de rij.
     */
    void sluitAchteraan(Dienblad klant) {
        mensenInDeRij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    Dienblad eerstePersoonInRij() {
        return mensenInDeRij.get(0);
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    boolean erIsEenRij() {
        if(mensenInDeRij.size() > 0) {
            return true;
        }
        return false;
    }
}