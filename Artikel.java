/**
 * Klasse Artikel
 *
 * Deze klasse beheert alle eigenschappen van de artikelen.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Artikel {

    /**
     * Private naam in de vorm van een string.
     */
    private String naam;

    /**
     * Private prijs in de vorm van een float.
     */
    private float prijs;

    /**
     * Constructor voor de klasse Artikel
     *
     * @param naam De naam voor het nieuwe artikel.
     * @param prijs De prijs voor het nieuwe artikel.
     */
    public Artikel(String naam, float prijs) {
        // Initialisatie van de variabelen.
        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * Default constructor voor de klasse Artikel, zonder variabelen.
     */
    public Artikel() {
        // Default initialisatie van de variabelen.
        this.naam = "";
        this.prijs = 0;
    }

    /**
     * Het intialiseren van de waarde voor de prijs.
     * @param prijs De prijs van het artikel.
     */
    protected void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    /**
     * Het ophalen van de waarde die hoort bij de variabele prijs.
     */
    protected float getPrijs() {
        return this.prijs;
    }

    /**
     * Het intialiseren van de waarde voor de naam.
     * @param naam De naam van het artikel.
     */
    protected void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * Het ophalen van de waarde die hoort bij de variabele naam.
     */
    protected String getNaam() {
        return this.naam;
    }
}
