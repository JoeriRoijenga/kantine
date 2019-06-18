package hanze.itv1e.project;

import java.util.*;

/**
 * Klasse Kantineaanbod
 *
 * Deze klasse beheert alle eigenschappen van het kantine aanbod.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
class KantineAanbod {
    /**
     *  Een private hashmap met een naam en arraylist van artikelen.
     */
    private HashMap<String, ArrayList<Artikel>> aanbod;

    /**
     *  Een private hashmap met een naam en integer.
     */
    private HashMap<String, Integer> startVoorraad;

    /**
     *  Een private hashmap met een naam en double.
     */
    private HashMap<String, Double> prijzen;

    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     *
     * @param artikelnaam Artikel naam
     * @param prijs Prijs van het artikel
     * @param hoeveelheid Hoeveelheid van de artikelen.
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) {
        aanbod=new HashMap<String, ArrayList<Artikel>>();
        startVoorraad=new HashMap<String, Integer>();
        prijzen=new HashMap<String,Double>();
        for(int i=0;i<artikelnaam.length;i++) 
        {
            ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
            for(int j=0;j<hoeveelheid[i];j++) 
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            startVoorraad.put(artikelnaam[i], hoeveelheid[i]);
            prijzen.put(artikelnaam[i], prijs[i]);
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /**
     * Deze methode vult de voorraad weer aan.
     *
     * @param productnaam Product waarvan de voorraad aangevuld moet worden.
     */
    private void vulVoorraadAan(String productnaam){
    	ArrayList<Artikel> huidigeVoorraad = aanbod.get(productnaam);
    	int startHoeveelheid = startVoorraad.get(productnaam);
    	int huidigeHoeveelheid = huidigeVoorraad.size();
    	double prijs = prijzen.get(productnaam);
        for(int j=huidigeHoeveelheid;j<startHoeveelheid;j++) 
        {
        	huidigeVoorraad.add(new Artikel(productnaam, prijs));
        }
        aanbod.put(productnaam, huidigeVoorraad);
    }

    /**
     * Private methode om de lijst van artikelen te krijgen op basis van de
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     *
     * @param productnaam Product naam
     * @return geeft het aanbod van het product terug.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
         return aanbod.get(productnaam); 
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken. 
     * Retourneert null als de stapel leeg is.
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) {
        if (stapel==null) { 
            return null;
        }
        if (stapel.size()==0)
        {
           return null;
        }
        else 
        {
            Artikel a=stapel.get(0);
            stapel.remove(0);
            if(stapel.size()<=10)vulVoorraadAan(a.getNaam());
            return a;
        }
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param productnaam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String productnaam) {
        return getArtikel(getArrayList(productnaam));
    }
}
