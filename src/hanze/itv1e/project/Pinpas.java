package hanze.itv1e.project;

/**
 * Klasse Pinpas
 *
 * Deze klasse beheert alle eigenschappen van de pinpas.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Pinpas extends Betaalwijze {
    /**
     * Het ingestelde kredietlimiet.
     */
    private double kredietlimiet;

    /**
     * Constructor
     *
     * @param saldo Het in te stellen saldo.
     * @param kredietlimiet Het in te stellen kreditlimiet.
     */
    Pinpas(double saldo, double kredietlimiet) {
        setSaldo(saldo);
        setKredietLimiet(kredietlimiet);
    }

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet Het nieuwe limiet.
     */
    private void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     *
     * @param tebetalen Het te betalen bedrag.
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        double nieuwSaldo = saldo - tebetalen;

        if (nieuwSaldo < 0 || tebetalen > kredietlimiet) {
            throw new TeWeinigGeldException("");
        }

        setSaldo(nieuwSaldo);
        System.out.println("Betaald pinpas");
    }
}
