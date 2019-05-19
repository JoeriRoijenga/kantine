package hanze.itv1e.project;
import java.util.*;
public class Datum {

	private int dag;
	private int maand;
	private int jaar;
	private ArrayList<Integer> maandenMet30;
	private ArrayList<Integer> maandenMet31;

	/**
	 * Constructor voor de klasse Datum
	 * @param dag de dag in een datum
	 * @param maand de maand in een datum
	 * @param jaar het jaar in een datum
	 * @return
	 */
	public Datum(int dag, int maand, int jaar){
		new Datum();
		if (bestaatDatum(dag, maand, jaar)) {
			this.dag = dag;
			this.maand = maand;
			this.jaar = jaar;
		}
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
	public String getDag() {
		if(String.valueOf(dag).length() == 1) {
			return "0" + dag;
		}
		return "" + dag;
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
	public String getMaand() {
		if(String.valueOf(maand).length() == 1) {
			return "0" + maand;
		}
		return "" + maand;
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
	public String getJaar() {
		if(String.valueOf(jaar).length() < 4) {
			return "000" + jaar;
		}
		return "" + jaar;
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



		if ((((jaar % 4) == 0) && ((jaar % 100) != 0)) || ((jaar % 400) == 0)) {
			schrikkeljaar = true;
		} else {
			schrikkeljaar = false;
		}

		List<Integer> maandenMet30 = Arrays.asList(4, 6, 9, 11);
		List<Integer> maandenMet31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

		if (dag >= 1) {
			if ((maand >= 1) && (maand <= 12)) {
				if ((jaar >= 1900) && (jaar <= 2100)) {
					if ((maandenMet30.contains(maand)) && (dag <= 30)) {
						return true;
					} else if ((maandenMet31.contains(maand)) && (dag <= 31)) {
						return true;
					} else if ((schrikkeljaar == false) && dag <= 28) {
						return true;
					} else if ((schrikkeljaar == true) && dag <= 29) {
						return true;

					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	public String getDatumAsString() {
		return getDag() + "-" + getMaand() + "-" + getJaar();
	}

 }
