package hanze.itv1e.project;

public class KantineSimulatie_1 {

    private Kantine kantine;

    public static final int DAGEN = 7;

    /**
     * Constructor
     */
    public KantineSimulatie_1() {
        kantine = new Kantine();
    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     *
     * @param dagen
     */
    public void simuleer(int dagen) {

        for (int i = 0; i < dagen; i++) {
            for (int j = 0; j < 10 + i; j++) {
                //kantine.loopPakSluitAan();
            }
            kantine.verwerkRijVoorKassa();
            System.out.println(kantine.aantalArtikelen());
            System.out.println(kantine.hoeveelheidGeldInKassa());
            kantine.resetKassa();
        }
    }


    /**
     * Start een simulatie
     */
    public static void main(String[] args) {
        int dagen = 7;

        if (args.length == 0) {
            dagen = DAGEN;
        } else {
            dagen = Integer.parseInt(args[0]);
        }

//       simuleer(dagen);
    }
}