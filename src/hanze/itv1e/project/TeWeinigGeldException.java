package hanze.itv1e.project;

/**
 * Klasse TeWeinigGeldException
 *
 * Deze klasse beheert alle eigenschappen van de te weinig geld exception.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
class TeWeinigGeldException extends Exception {
    /**
     * Constructor
     */
    TeWeinigGeldException() {
        super();
    }

    /**
     * Constructor
     *
     * @param e Exeception
     */
    TeWeinigGeldException(Exception e) {
        super (e);
    }

    /**
     * Constructor
     *
     * @param message Message voor de exception.
     */
    TeWeinigGeldException(String message) {
        super(message);
    }

}




