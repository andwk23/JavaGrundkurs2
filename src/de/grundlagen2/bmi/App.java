package de.grundlagen2.bmi;

import java.util.Scanner;

import de.grundlagen2.bmi.controller.BMIRechner;
import de.grundlagen2.bmi.model.Katze;
import de.grundlagen2.bmi.model.Lebewesen;

public class App {
	
	private Scanner scanner = new Scanner(System.in);
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
		scanner.close();
		System.out.println("BMI [Programm ist beendet]");
	}
	
	// Umbau nach dem EVA-Prinzip (Eingabe, Verarbeite, Ausgabe)

	private void gibEin() {			// E
		
		lebewesen = new Katze();
		
		System.out.print("BMI [Geben Sie den Namen ein] > ");
		String name = scanner.next();
		lebewesen.setName(name);
		
		System.out.print("BMI [Geben Sie die Größe[m] ein] > ");
		double groesse = scanner.nextDouble();
		lebewesen.setGroesse(groesse);
		
		System.out.print("BMI [Geben Sie das Gewicht[kg] ein] > ");
		double gewicht = scanner.nextDouble();
		lebewesen.setGewicht(gewicht);
	}

	private void verarbeite() {		// V
		BMIRechner rechner = new BMIRechner();
		ergebnis = rechner.pruefe(lebewesen);
	}
	
	private void gibAus() {			// A
		System.out.println("BMI [ergebnis = " + ergebnis + "]");
	}

}
