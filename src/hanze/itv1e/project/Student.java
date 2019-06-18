package hanze.itv1e.project;

public class Student extends Persoon {

    /**
     * Studentnummer als getal
     */
    public double studentNummer;
    /**
     * String met studierichting
     */
    public String studieRichting;

    /**
     * Constructor
     *
     * @param studentNummer Nummer van de student
     * @param studieRichting Studierichting van de student
     * @param BSN BSN van de student
     * @param voornaam Voornaam van de student
     * @param achternaam Achternaam van de student
     * @param geboorteDatum Geboorte datum van de student
     * @param geslacht Geslacht van de student
     */
    public Student(double studentNummer, String studieRichting, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht, int betaalwijze) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht, betaalwijze);
    }

    /**
     * Constructor
     *
     * @param studentNummer Nummer van de student
     * @param studieRichting Studierichting van de student
     * @param BSN BSN van de student
     * @param voornaam Voornaam van de student
     * @param achternaam Achternaam van de student
     */
    public Student(double studentNummer, String studieRichting, int BSN, String voornaam, String achternaam, int betaalwijze) {
        super(BSN, voornaam, achternaam, betaalwijze);
    }

    /**
     * Returned de studierichting van de student
     * @return studierichting van de student
     */
    private String getStudieRichting() {
        return studieRichting;
    }

    /**
     * Set de studierichting van de student
     * @param studieRichting van de student
     */
    private void setStudieRichting(String studieRichting) {
        this.studieRichting = studieRichting;
    }

    /**
     * Return de studentnummer van de student
     * @return studentnummer
     */
    private double getStudentNummer() {
        return studentNummer;
    }

    /**
     * Set de studentnummer van de student
     * @param studentNummer
     */
    private void setStudentNummer(double studentNummer) {
        this.studentNummer = studentNummer;
    }
}
