package paket1;

import java.util.ArrayList;
import java.util.List;

public class Racunanje {

	public static double pazarUkupno(int deset, int dvadeset, int pedeset, int sto, int dvesta, int petsto, int hiljadu, int dvehiljade, int pethiljada, int drugo1, double drugo2) {
		double ukupno; // Promenljiva
		//Formula za racunanje
		ukupno = 10 * deset + 20 * dvadeset + 50 * pedeset + 100 * sto + 200 * dvesta + 500 * petsto + 1000 * hiljadu + 2000 * dvehiljade + 5000 * pethiljada + drugo1 * drugo2;
		//System.out.println("" + ukupno);
		return ukupno;
	}
	
	//Metoda za specifikaciju pazara
	public static List<Pazar> pazarSpec(int deset, int dvadeset, int pedeset, int sto, int dvesta, int petsto, int hiljadu, int dvehiljade, int pethiljada, int drugo1, double drugo2) {
		ArrayList<Pazar> pazarSpecLista = new ArrayList<Pazar>(); //Kreiranje liste
		
		
		
		pazarSpecLista.add(new Pazar(deset, dvadeset, pedeset, sto, dvesta, petsto, hiljadu, dvehiljade, pethiljada, drugo1, drugo2)); //Dodela
		
		return pazarSpecLista;
	}
	
}
