package de.grundlagen2.bmi;

import de.grundlagen2.bmi.controller.BMIRechner;
import de.grundlagen2.bmi.model.Katze;
import de.grundlagen2.bmi.model.Lebewesen;

public class App {

	public static void main(String[] args) {
		
		Lebewesen lebewesen = new Katze();
		lebewesen.setName("Pinki");
		lebewesen.setGroesse(0.51);
		lebewesen.setGewicht(6.1);
		
		BMIRechner rechner = new BMIRechner();
		String ergebnis = rechner.pruefe(lebewesen);
		
		System.out.println("BMI [ergebnis = " + ergebnis + "]");
	}

}
