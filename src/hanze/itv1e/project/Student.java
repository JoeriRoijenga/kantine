package hanze.itv1e.project;

/**
 * Klasse Student
 *
 * Deze klasse beheert alle eigenschappen van de student.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Student extends Persoon {

    /**
     * Studentnummer als getal
     */
    private double studentNummer;
    /**
     * String met studierichting
     */
    private String studieRichting;

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
    Student(double studentNummer, String studieRichting, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht, int betaalwijze) {
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
    Student(double studentNummer, String studieRichting, int BSN, String voornaam, String achternaam, int betaalwijze) {
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
