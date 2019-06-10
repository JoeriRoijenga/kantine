package hanze.itv1e.project;

public class Administratie {

    /**
     * Deze methode berekent van de int array aantal de gemiddelde waarde
     *
     * @param aantal
     * @return het gemiddelde
     */
    public double berekenGemiddeldAantal(int[] aantal) {
        double total = 0;

        for (int i = 0; i < aantal.length ; i++) {
            total = total + aantal[i];

        }
        double avg;
        avg = total / aantal.length;
        return avg;
    }

    /**
     * Deze methode berekent van de double array omzet de gemiddelde waarde
     *
     * @param omzet
     * @return het gemiddelde
     */
    public double berekenGemiddeldeOmzet(double[] omzet) {
        double total = 0;

        for (int i = 0; i < omzet.length; i++) {
            total = total + omzet[i];
        }
        double avg;
        avg = total / omzet.length;
        return avg;
    }

    /**
     * Methode om dagomzet uit te rekenen
     *
     * @param omzet
     * @return array (7 elementen) met dagomzetten
     */

    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[7];
        for(int i = 0; i < 7; i++) {

            int j = 0;
//            while( ... ) {
//                temp[i] += omzet[i + 7 * j];
//
//                // omitted
//
//            }
        }
        return temp;
    }
}
