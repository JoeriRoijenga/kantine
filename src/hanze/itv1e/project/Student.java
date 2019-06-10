package hanze.itv1e.project;

public class Student extends Persoon {

    public double studentNummer;
    public String studieRichting;

    public Student(double studentNummer, String studieRichting, int BSN, String voornaam, String achternaam, String geboorteDatum, String geslacht) {
        super(BSN, voornaam, achternaam, geboorteDatum, geslacht);
    }

    private String getStudieRichting() {
        return studieRichting;
    }

    private void setStudieRichting(String studieRichting) {
        this.studieRichting = studieRichting;
    }

    private double getStudentNummer() {
        return studentNummer;
    }

    private void setStudentNummer(double studentNummer) {
        this.studentNummer = studentNummer;
    }
}
