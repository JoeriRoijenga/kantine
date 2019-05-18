package hanze.itv1e.project;

import java.util.ArrayList;

public class KassaRij {

    private ArrayList<Dienblad> mensenInDeRij;
    /**
     * Constructor
     */
    public KassaRij() {
        ArrayList<Dienblad> mensenInDeRij = new ArrayList<Dienblad>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        mensenInDeRij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        return mensenInDeRij.get(0);
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        if(mensenInDeRij.size() > 0) {
            return true;
        }
        return false;
    }
}