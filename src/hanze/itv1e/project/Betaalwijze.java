package hanze.itv1e.project;

/**
 * Klasse Betaalwijze
 *
 * Deze klasse beheert alle eigenschappen van de betaalwijze.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public abstract class Betaalwijze {
    /**
     * Het huidige saldo als double
     */
    protected double saldo;

    /**
     * Methode om krediet te initialiseren
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Methode om betaling af te handelen
     *
     * @param tebetalen
     * @return Boolean om te kijken of er voldoende saldo is
     */
    public abstract void betaal(double tebetalen) throws Exception;
}