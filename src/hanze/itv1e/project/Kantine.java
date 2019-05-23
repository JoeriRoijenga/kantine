package hanze.itv1e.project;

/**
 * Klasse Kantine
 *
 * Deze klasse beheert alle eigenschappen van de kantine.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
class Kantine {
    /**
     * Private kassa object met alle eigenschappen van de kassa.
     */
    private Kassa kassa;

    /**
     * Private kassarij object met alle eigenschappen van de kassarij.
     */
    private KassaRij kassarij;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * Klant komt binnen, pakt een dienblad en gaat naar de kassa.
     */
    public void loopPakSluitAan() {
        Persoon persoon = new Persoon(748372947, "Test", "Tester", "13-05-2019", "V");
        persoon.pakDienblad();
        Dienblad dienblad = persoon.krijgDienblad();

        Artikel artikel1 = new Artikel("Banaan", 1.99);
        Artikel artikel2 = new Artikel("Peer", 1.20);

        dienblad.voegToe(artikel1);
        dienblad.voegToe(artikel2);

        kassarij.sluitAchteraan(persoon);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while(kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
            kassarij.verwijderPersoonInRij();
        }
    }

    /**
     * Deze methode telt het geld uit de kassa
     *
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa() {
        return kassa.getGeld();
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     *
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen() {
        return kassa.getAantal();
    }

    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() {
        kassa.setGeld(0);
        kassa.setAantal(0);
    }
}