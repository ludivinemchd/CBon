package application;

import java.util.ArrayList;

/**
 * Repas crée l'objet Repas et les méthodes nécéssaires pour y ajouter des
 * aliments et en récupérer des informations.
 * 
 * @author Dimah
 * 
 *
 */
public class Repas {

	protected ArrayList<Aliment> alimentsRepas;
	protected TypeRepas repas;
	protected double calories, proteines, glucides, lipides;

	/**
	 * Crée le type d'objet Repas, array d'aliments
	 * 
	 * @param type
	 * 
	 */
	public Repas(TypeRepas type) {
		repas = type;
		alimentsRepas = new ArrayList<Aliment>();
	}

	/**
	 * Prend un aliment et l'ajoute à un repas.
	 * 
	 * @param a
	 * 
	 */
	public void ajouterAliment(Aliment a) {
		alimentsRepas.add(a);
		calories += a.getCalories();
		proteines += a.getProteines();
		glucides += a.getGlucides();
		lipides += a.getLipides();
		System.out.println();
		System.out.println(" Aliment ajoute avec succe ");
		System.out.println();
	}

	public double getCalories() {
		return calories;
	}

	public double getProteines() {
		return proteines;
	}

	public double getGlucides() {
		return glucides;
	}

	public double getLipides() {
		return lipides;
	}

}
