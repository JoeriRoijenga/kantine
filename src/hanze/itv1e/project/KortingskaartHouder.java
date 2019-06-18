package hanze.itv1e.project;

/**
 * Klasse KantineMedewerker
 *
 * Deze klasse beheert alle eigenschappen van de kantine medewerker.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public interface KortingskaartHouder {
    /**
     * Methode om kortingspercentage op te vragen
     */
    double geefKortingsPercentage();

    /**
     * Methode om op te vragen of er maximum per keer aan de korting zit
     */
    boolean heeftMaximum();

    /**
     * Methode om het maximum kortingsbedrag op te vragen
     */
    double geefMaximum();
}