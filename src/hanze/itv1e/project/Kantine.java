package hanze.itv1e.project;

import javax.persistence.EntityManager;

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
     * Private kantine aanbod object met alle eigenschappen van het kantine aanbod.
     */
    private KantineAanbod kantineAanbod;

//    private EntityManager manager;

    /**
     * Constructor
     */
    public Kantine(EntityManager manager) {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij, manager);
//        this.manager = manager;
    }

    /**
     * Klant komt binnen, pakt een dienblad en gaat naar de kassa.
     *
     * @param persoon Klant
     */
    public void loopPakSluitAan(Persoon persoon) {
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

    /**
     * Haalt het aanbod van de kantine op.
     *
     * @return kantineAanbod Het aanbod van de kantine.
     */
    public KantineAanbod getKantineAanbod() {
        return kantineAanbod;
    }

    /**
     * Zet een nieuw kantine aanbod.
     *
     * @param kantineAanbod Het nieuwe kantine aanbod.
     */
    public void setKantineAanbod(KantineAanbod kantineAanbod) {
        this.kantineAanbod = kantineAanbod;
    }

    /**
     * Het ophalen van de huidige kassa.
     *
     * @return kassa
     */
    public Kassa getKassa() {
        return kassa;
    }
}