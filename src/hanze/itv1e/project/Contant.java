package hanze.itv1e.project;

public class Contant extends Betaalwijze {

    Contant(double saldo) {
        setSaldo(saldo);
    }

    /**
     * Methode om betaling af te handelen
     */
    public void betaal(double tebetalen) {
        double nieuwSaldo = saldo - tebetalen;
        try {
            if (nieuwSaldo < 0) {
                throw new TeWeinigGeldException("");
            }
            setSaldo(nieuwSaldo);
        } catch (TeWeinigGeldException e) {
            System.out.println("Te weinig geld");
        }
        setSaldo(nieuwSaldo);

    }
}