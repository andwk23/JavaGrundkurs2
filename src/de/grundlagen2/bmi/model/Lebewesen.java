package de.grundlagen2.bmi.model;

public class Lebewesen {

	private String name;
	private double gewicht;
	private double groesse;

	public Lebewesen() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gewicht
	 */
	public double getGewicht() {
		return gewicht;
	}

	/**
	 * @param gewicht the gewicht to set
	 */
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	/**
	 * @return the groesse
	 */
	public double getGroesse() {
		return groesse;
	}

	/**
	 * @param groesse the groesse to set
	 */
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

}