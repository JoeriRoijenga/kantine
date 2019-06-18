package hanze.itv1e.project;

public class Contant extends Betaalwijze {

    Contant(double saldo) {
        setSaldo(saldo);
    }

    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        double nieuwSaldo = saldo - tebetalen;

        if (nieuwSaldo < 0) {
            return false;
        }

        setSaldo(nieuwSaldo);

        return true;
    }
}