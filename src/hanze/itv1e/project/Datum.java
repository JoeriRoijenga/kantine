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
	 *
	 * @param geboorteDatum datum voor het object
	 */
	Datum(String geboorteDatum){
		int[] datum = datumVerwerken(geboorteDatum);

		if (bestaatDatum(datum[0], datum[1], datum[2])) {
			setDag(datum[0]);
			setMaand(datum[1]);
			setJaar(datum[2]);
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
	 * Zorgt er voor dat je integers krijgt van de string met de datum.
	 * @param geboorteDatum De datum als string.
	 * @return array met de datum als integers.
	 */
	private int[] datumVerwerken(String geboorteDatum) {
		int[] ints = new int[3];
		String[] strings = new String[3];

		strings = geboorteDatum.split("-");
		ints[0] = Integer.parseInt(strings[0]);
		ints[1] = Integer.parseInt(strings[1]);
		ints[2] = Integer.parseInt(strings[2]);

		return ints;
	}

	/**
	 * Haalt de dag van de datum op
	 *
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
	 *
	 * @param dag De nieuw dag.
	 */
	private void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * haalt de maand van een datum op
	 *
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
	 *
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
	 *
	 * @param jaar Nieuwe waarde voor jaar.
	 */
	private void setJaar(int jaar) {
		this.jaar = jaar;
	}

	/**
	 * Gaat na of de datum daadwerkelijk bestaat.
	 *
	 * @param dag Param met de dag.
	 * @param maand Param met de maand.
	 * @param jaar Param met het jaar.
	 * @return boolean
	 */
	boolean bestaatDatum(int dag, int maand, int jaar){
		boolean schrikkeljaar;

		schrikkeljaar = jaar % 4 == 0 && jaar % 100 != 0 || jaar % 400 == 0;

		List<Integer> maandenMet30 = Arrays.asList(4, 6, 9, 11);
		List<Integer> maandenMet31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

		if (dag >= 1) {
			if ((maand >= 1) && (maand <= 12)) {
				if ((jaar >= 1900) && (jaar <= 2100)) {
					if ((maandenMet30.contains(maand)) && (dag <= 30)) {
						return true;
					} else if ((maandenMet31.contains(maand)) && (dag <= 31)) {
						return true;
					} else if ((!schrikkeljaar) && dag <= 28) {
						return true;
					} else
						return (schrikkeljaar) && dag <= 29;
				}
			}
		}

		return false;
	}
	
	/**
	 * Haalt alle informatie op van de datum en geeft de datum als string terug.
	 *
	 * @return Geboortedatum
	 */
	String getDatumAsString() {
		return getDag() + "-" + getMaand() + "-" + getJaar();
	}
 }
