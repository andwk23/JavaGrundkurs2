package de.grundlagen2.bmi;

import de.grundlagen2.bmi.controller.BMIRechner;
import de.grundlagen2.bmi.model.Katze;
import de.grundlagen2.bmi.model.Lebewesen;

public class App {
	
	private Lebewesen lebewesen;
	private String ergebnis;

	public static void main(String[] args) {
		new App();
	}
	
	// Konstruktor
	private App() {
		System.out.println("BMI [Programm ist gestartet]");
		gibEin();
		verarbeite();
		gibAus();
		System.out.println("BMI [Programm ist beendet]");
	}
	
	// Umbau nach dem EVA-Prinzip (Eingabe, Verarbeite, Ausgabe)

	private void gibEin() {			// E
		lebewesen = new Katze();
		lebewesen.setName("Pinki");
		lebewesen.setGroesse(0.51);
		lebewesen.setGewicht(6.1);
	}

	private void verarbeite() {		// V
		BMIRechner rechner = new BMIRechner();
		ergebnis = rechner.pruefe(lebewesen);
	}
	
	private void gibAus() {			// A
		System.out.println("BMI [ergebnis = " + ergebnis + "]");
	}

}
