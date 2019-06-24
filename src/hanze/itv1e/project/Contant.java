package hanze.itv1e.project;

/**
 * Klasse Contant
 *
 * Deze klasse beheert alle eigenschappen van contant betalen.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Contant extends Betaalwijze {
    /**
     * Constructor
     * @param saldo Het nieuwe saldo.
     */
    Contant(double saldo) {
        setSaldo(saldo);
    }

    /**
     * Methode om betaling af te handelen
     *
     * @param tebetalen Het te betalen bedrag.
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        double nieuwSaldo = saldo - tebetalen;

        if (nieuwSaldo < 0) {
            throw new TeWeinigGeldException("");
        }
        setSaldo(nieuwSaldo);
        System.out.println("Betaald Contant");

        setSaldo(nieuwSaldo);
    }
}