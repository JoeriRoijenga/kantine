package hanze.itv1e.project;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("Personen maken");
        System.out.println("-----------------");

        Persoon persoon = new Persoon(748372947, "Test", "Tester", "13-05-2019", "V");
        Persoon persoon1 = new Persoon(748372948, "Test", "Tester");

        System.out.println(persoon.toString());
        System.out.println(persoon1.toString());

        System.out.println("-----------------");
        System.out.println("Artikelen maken");
        System.out.println("-----------------");

        Artikel artikel1 = new Artikel("Banaan", 1.99);
        Artikel artikel2 = new Artikel("Peer", 1.20);
        Artikel artikel3 = new Artikel("Appel", 1.50);

        System.out.println(artikel1.toString());
        System.out.println(artikel2.toString());
        System.out.println(artikel3.toString());

        System.out.println("-----------------");
        System.out.println("Dienblad pakken & tellen");
        System.out.println("-----------------");

        persoon.pakDienblad();
        persoon.pakDienblad();

        System.out.println(persoon.telDienbladen());

        persoon.kiesDienblad(1);

        persoon.voegArtikelToe(artikel1);
        persoon.voegArtikelToe(artikel3);
        persoon.voegArtikelToe(artikel2);

        System.out.println(persoon.prijsDienblad());
        System.out.println(persoon.aantalOpDienblad());

        System.out.println("-----------------");
        System.out.println("Kassa");
        System.out.println("-----------------");

        KassaRij kassaRij = new KassaRij();
        kassaRij.sluitAchteraan(persoon);

        Kassa kassa = new Kassa(kassaRij);
        kassa.rekenAf(kassaRij.eerstePersoonInRij());

        System.out.println(persoon.telDienbladen());

        System.out.println("-----------------");
        System.out.println("Statistieken");
        System.out.println("-----------------");

        System.out.println("Aantal artikelen over de toonbank: " + kassa.getAantal());
        System.out.println("Geld in de kassa: " + kassa.getGeld());

        System.out.println("-----------------");
        System.out.println("Datum");
        System.out.println("-----------------");

        Datum datum = new Datum("30-02-2014");
        System.out.println(datum.bestaatDatum(29, 02, 2012));
        System.out.println(datum.getDag());
        System.out.println(datum.getMaand());
        System.out.println(datum.getJaar());


    }
}
