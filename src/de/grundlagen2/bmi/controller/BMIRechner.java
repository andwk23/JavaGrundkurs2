package de.grundlagen2.bmi.controller;

import de.grundlagen2.bmi.model.Lebewesen;

public class BMIRechner {
	
	public final static double BMI_MAX = 25.0;
	public final static double BMI_MIN = 18.5;
	
	public String pruefe(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		
		String ergebnis = null;
		if(bmi >= BMI_MAX) {
			ergebnis = "UEBERGEWICHTIG";
		} else if (bmi < BMI_MIN) {
			ergebnis = "Untergewichtig";
		}
		else {
			ergebnis = "Normalgewicht";
		}
		
		return ergebnis;
	}
}
