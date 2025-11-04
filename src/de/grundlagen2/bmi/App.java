package de.grundlagen2.bmi;

import java.util.Scanner;

import de.grundlagen2.bmi.controller.BMIRechner;
import de.grundlagen2.bmi.model.Fisch;
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
		
		while (true) {
			System.out.print("BMI [1=Eingabe 2=Verarbeiten 3=Ausgabe 4=Beenden] > ");
			int auswahl = scanner.nextInt();
			
			if(auswahl == 1) {
				gibEin();
			}
			else if(auswahl == 2) {
				verarbeite();
			}
			else if(auswahl == 3) {
				gibAus();
			}
			else if(auswahl == 4) {
				break;
			}

			else {
				System.out.println("BMI [Falsche Eingabe!]");
			}
		}
		
		scanner.close();
		System.out.println("BMI [Programm ist beendet]");
	}
	
	// Umbau nach dem EVA-Prinzip (Eingabe, Verarbeite, Ausgabe)

	private void gibEin() {			// E
		
		
		while(true) {
			System.out.print("BMI [1=Katze 2=Fisch] > ");			
			int lebewesenTyp = scanner.nextInt();
			
			if(lebewesenTyp == 1) {
				lebewesen = new Katze();
				break;
			}
			else if(lebewesenTyp == 2) {
				lebewesen = new Fisch();
				break;
			}

			else {
				System.out.println("BMI [Falsche Eingabe!]");
			}
		}
		
		if(lebewesen instanceof Katze) {
			System.out.println("BMI [Neue Katze]");
		}
		else if(lebewesen instanceof Fisch) {
			System.out.println("BMI [Neuer Fisch]");
		}
		
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
