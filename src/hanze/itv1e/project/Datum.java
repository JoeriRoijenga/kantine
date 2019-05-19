package hanze.itv1e.project;

import java.util.*;

/**
 * Klasse Datum
 *
 * Deze klasse beheert alle eigenschappen van de datum.
 *
 * @author Joeri Roijenga & Niels de Vries.
 * @version 0.1 (13-05-2019)
 */
public class Datum {

	/**
	 * Private dag in de vorm van een int.
	 */
	private int dag;

	/**
	 * Private maand in de vorm van een int.
	 */
	private int maand;

	/**
	 * Private jaar in de vorm van een int.
	 */
	private int jaar;

	/**
	 * Private array met de maanden met 30 dagen.
	 */
	private ArrayList<Integer> maandenMet30;

	/**
	 * Private array met de maanden met 31 dagen.
	 */
	private ArrayList<Integer> maandenMet31;

	/**
	 * Constructor voor de klasse Datum
	 * @param dag de dag in een datum
	 * @param maand de maand in een datum
	 * @param jaar het jaar in een datum
	 */
	Datum(int dag, int maand, int jaar){
		if (bestaatDatum(dag, maand, jaar)) {
			setDag(dag);
			setMaand(maand);
			setJaar(jaar);
		}
	}

	/**
	 * Default constructor voor de klasse Datum
	 */
	 Datum() {
	 	setDag(0);
		setMaand(0);
		setJaar(0);
	}

	/**
	 * Haalt de dag van de datum op
	 * @return dag
	 */
	String getDag() {
		if(String.valueOf(dag).length() == 1) {
			return "0" + dag;
		}
		return "" + dag;
	}

	/**
	 * Stelt de dag van een datum in
	 * @param dag De nieuw dag.
	 */
	private void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * haalt de maand van een datum op
	 * @return maand
	 */
	String getMaand() {
		if(String.valueOf(maand).length() == 1) {
			return "0" + maand;
		}
		return "" + maand;
	}

	/**
	 * Stelt de maand van een datum in
	 * @param maand Nieuw waarde voor maand.
	 */
	private void setMaand(int maand) {
		this.maand = maand;
	}

	/**
	 * Geeft het jaar van een datum terug
	 * @return jaar
	 */
	 String getJaar() {
		if(String.valueOf(jaar).length() < 4) {
			return "000" + jaar;
		}
		return "" + jaar;
	}

	/**
	 * stelt het jaar van een datum in
	 * @param jaar Nieuwe waarde voor jaar.
	 */
	private void setJaar(int jaar) {
		this.jaar = jaar;
	}

	/**
	 * Gaat na of de datum daadwerkelijk bestaat.
	 * @param dag
	 * @param maand
	 * @param jaar
	 * @return boolean
	 */
	boolean bestaatDatum(int dag, int maand, int jaar){
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
	 * Haalt alle informatie op van de datum en geeft de datum als string terug.
	 * @return Geboortedatum
	 */
	String getDatumAsString() {
		return getDag() + "-" + getMaand() + "-" + getJaar();
	}
 }
