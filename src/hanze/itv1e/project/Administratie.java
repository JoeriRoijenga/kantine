package hanze.itv1e.project;

class Administratie {
    static final int DAYS_IN_WEEK = 7;

    /**
     * Deze methode berekent van de int array aantal de gemiddelde waarde
     *
     * @param aantal
     * @return het gemiddelde
     */
    static double berekenGemiddeldAantal(int[] aantal) {
        double total = 0;

        for (int i = 0; i < aantal.length ; i++) {
            total = total + aantal[i];
        }

        return total / aantal.length;
    }

    /**
     * Deze methode berekent van de double array omzet de gemiddelde waarde
     *
     * @param omzet
     * @return het gemiddelde
     */
    static double berekenGemiddeldeOmzet(double[] omzet) {
        double total = 0;

        for (int i = 0; i < omzet.length; i++) {
            total = total + omzet[i];
        }

        return total / omzet.length;
    }

    /**
     * Methode om dagomzet uit te rekenen
     *
     * @param omzet
     * @return array (7 elementen) met dagomzetten
     */
    static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[7];
        for(int i = 0; i < DAYS_IN_WEEK; i++) {

            int j = 0;

            try {
                while(j < 2) {
                    temp[i] += omzet[i + 7 * j];
                    j++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }

        }
        return temp;
    }
}
