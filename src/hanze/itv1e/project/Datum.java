package hanze.itv1e.project;

public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	/**
	 * Constructor voor de klasse Datum
	 * @param dag de dag in een datum
	 * @param maand de maand in een datum
	 * @param jaar het jaar in een datum
	 * @return
	 */
	public Datum(int dag, int maand, int jaar){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}

	/**
	 * Paramteterloze constructor voor de klasse Datum
	 */
	public Datum() {
		this.dag = 0;
		this.maand = 0;
		this.jaar = 0;
	}

	/**
	 * Haalt de dag van de datum op
	 * @return dag
	 */
	public int getDag() {
		return dag;
	}

	/**
	 * Stelt de dag van een datum in
	 * @param dag
	 */
	public void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * haalt de maand van een datum op
	 * @return maand
	 */
	public int getMaand() {
		return maand;
	}

	/**
	 * Stelt de maand van een datum in
	 * @param maand
	 */
	public void setMaand(int maand) {
		this.maand = maand;
	}

	/**
	 * Geeft het jaar van een datum terug
	 * @return
	 */
	public int getJaar() {
		return jaar;
	}

	/**
	 * stelt het jaar van een datum in
	 * @param jaar
	 */
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public boolean bestaatDatum(int dag, int maand, int jaar){
		boolean schrikkeljaar;
		if ((((jaar %= 4) == 0) && ((jaar %= 100) != 0)) || ((jaar %= 400) == 0)) {
			schrikkeljaar = true;
		} else {
			schrikkeljaar = false;
		}
		return schrikkeljaar;
	}
	
	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	/**public String getDatumAsString() {
		// TODO
		return "";
		}
*/
	 }
