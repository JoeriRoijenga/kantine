package hanze.itv1e.project;

public class Pinpas extends Betaalwijze {

    private double kredietlimiet;

    Pinpas(double saldo, double kredietlimiet) {
        setSaldo(saldo);
        setKredietLimiet(kredietlimiet);
    }

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        double nieuwSaldo = saldo - tebetalen;

        if (nieuwSaldo < 0 || tebetalen > kredietlimiet) {
            return false;
        }

        setSaldo(nieuwSaldo);

        return true;
    }
}
