package hanze.itv1e.project;

import java.time.LocalDate;
import java.io.Serializable;
import java.util.Iterator;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Factuur implements Serializable {
    private Long id;
    private LocalDate datum;
    private double korting;
    private double totaal;
    private int aantal;

    public Factuur() {
        totaal = 0;
        korting = 0;
    }

    public Factuur(Persoon klant, LocalDate datum) {
        this();
        this.datum = datum;
        verwerkBestelling(klant);
    }

    /**
     * Het laten berekenen van de prijs.
     * @param artikelen Een iterator met de prijs.
     * @return Een prijs in de vorm van een double.
     */
    double berekenPrijs(Iterator artikelen) {
        double prijs = 0;

        while (artikelen.hasNext()) {
            Artikel artikel = (Artikel) artikelen.next();
            prijs += artikel.getPrijs();
        }

        return prijs;
    }

    /**
    * Verwerk artikelen en pas kortingen toe.
    *
    * Zet het totaal te betalen bedrag en het
    * totaal aan ontvangen kortingen.
    *
    * @param klant
    */
    private void verwerkBestelling(Persoon klant) {
        Dienblad dienblad = klant.krijgDienblad();
        double prijs = berekenPrijs(dienblad.getArtikelen());
        setKorting(prijs, klant);
        setTotaal(prijs);
        setAantal(dienblad.getAantalArtikelen());
    }

    void setKorting (double prijs, Persoon klant) {
        double percentage = 0;
        double korting;
        boolean heeftMaximum = false;
        double maximum = 0;

        if (klant instanceof Docent) {
            percentage = ((Docent) klant).geefKortingsPercentage();
            heeftMaximum = ((Docent) klant).heeftMaximum();
            maximum = ((Docent) klant).geefMaximum();
        } else if (klant instanceof KantineMedewerker) {
            percentage = ((KantineMedewerker) klant).geefKortingsPercentage();
            heeftMaximum = ((KantineMedewerker) klant).heeftMaximum();
            maximum = ((KantineMedewerker) klant).geefMaximum();
        }

        korting = prijs * (percentage / 100);

        if (korting > maximum && heeftMaximum) {
            korting = maximum;
        }

        this.korting = new BigDecimal(korting).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
    * @return de toegepaste korting
    */
    public double getKorting() {
        return korting;
    }

    void setTotaal(double totaal) {
        this.totaal = new BigDecimal(totaal - getKorting()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /*
     * @return het totaalbedrag
     */
    public double getTotaal() {
        return totaal;
    }

    void setAantal(int aantal) {
        this.aantal = aantal;
    }

    int getAantal() {
        return this.aantal;
    }

    /**
    * @return een printbaar bonnetje
    */
    public String toString() {
        return "Je prijstotaal is: " + getTotaal() + " en je korting is: " + getKorting();
    }
}
