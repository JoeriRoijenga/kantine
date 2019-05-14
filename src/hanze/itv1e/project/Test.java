package hanze.itv1e.project;

public class Test {
    public static void main(String[] args) {
        Persoon persoon = new Persoon(748372947, "Test", "Tester", "13-05-2019", "V");
        System.out.println(persoon.toString());
        Persoon persoon1 = new Persoon(748372948, "Test", "Tester");
        System.out.println(persoon1.toString());

        Artikel artikel = new Artikel("Banaan", 1.99);
        System.out.println(artikel.toString());

        Datum datum = new Datum(30, 02, 2014);
        System.out.println(datum.bestaatDatum(30, 02, 2014));
        System.out.println(datum.getDag());
        System.out.println(datum.getMaand());
        System.out.println(datum.getJaar());
    }
}
