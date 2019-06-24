package hanze.itv1e.project;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Klasse Kantinesimulator_2
 *
 * Deze klasse beheert alle eigenschappen van de kantinesimulator versie 2.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class KantineSimulatie_2 {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory("KantineSimulatie");
    private EntityManager manager;

    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;

    // artikelen
    private static final String[] artikelnamen = new String[]
        {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};

    // prijzen
    private static double[] artikelprijzen = new double[]{1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    /**
     * Constructor
     */
    public KantineSimulatie_2() {
        kantine = new Kantine();
        random = new Random();
        int[] hoeveelheden = getRandomArray(
            AANTAL_ARTIKELEN,
            MIN_ARTIKELEN_PER_SOORT,
            MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(
            artikelnamen, artikelprijzen, hoeveelheden);

        kantine.setKantineAanbod(kantineaanbod);
    }



    public void runVoorbeeld() {
        manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        simuleer(3);
        manager.close();
        ENTITY_MANAGER_FACTORY.close();
    }



    /**
     * Methode om een array van random getallen liggend tussen
     * min en max van de gegeven lengte te genereren
     *
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp = new int[lengte];
        for(int i = 0; i < lengte ;i++) {
            temp[i] = getRandomValue(min, max);
        }

        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl)
     * en max(incl) te genereren.
     *
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     *
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen = new String[indexen.length];

        for(int i = 0; i < indexen.length; i++) {
            artikelen[i] = artikelnamen[indexen[i]];

        }

        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen
     * in het verloop van de kantine
     *
     * @param dagen
     */
    public void simuleer(int dagen) {
        // for lus voor dagen
        for(int i = 0; i < dagen; i++) {

            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen = 100;

            // laat de personen maar komen...
            for(int j = 0; j < aantalpersonen; j++) {

                // maak persoon en dienblad aan, koppel ze
                // en bedenk hoeveel artikelen worden gepakt
                Persoon persoon = makenPersoon();//new Docent("3", "asfasdf",748372947, "Test", "Tester");
                persoon.pakDienblad();
                persoon.kiesDienblad(1);

                int aantalartikelen = 4;

                // genereer de "artikelnummers", dit zijn indexen
                // van de artikelnamen
                int[] tepakken = getRandomArray(
                    aantalartikelen, 0, AANTAL_ARTIKELEN-1);

                // vind de artikelnamen op basis van
                // de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);

                // loop de kantine binnen, pak de gewenste
                // artikelen, sluit aan
                for (String artikelNaam : artikelen) {
                    persoon.voegArtikelToe(kantine.getKantineAanbod().getArtikel(artikelNaam));
                }
                kantine.loopPakSluitAan(persoon);
            }

            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();

            // druk de dagtotalen af en hoeveel personen binnen
            // zijn gekomen
            System.out.println();
            System.out.println("Geld in de kassa: " + kantine.hoeveelheidGeldInKassa());
            System.out.println();
            System.out.println("Aantal artikelen over de toonbank: " + kantine.aantalArtikelen());

            // reset de kassa voor de volgende dag
            kantine.resetKassa();
        }
    }

    /**
     * Het maken van een persoon voor de simulator.
     * @return nieuw persoon
     */
    Persoon makenPersoon() {
        int a = random.nextInt(100);
        Persoon persoon;

        if (a >= 0 && a <= 9) {
            persoon = new Docent("3", "a", 723, "Test", "testus", 1);
        } else if (a >= 10 && a <= 98 ) {
            persoon = new Student(33, "NSE", 724, "Testi", "Testus", 1);
        } else {
            persoon = new KantineMedewerker(22, true, 725, "Berta", "Bertus", 0);
        }


        return persoon;
    }
}