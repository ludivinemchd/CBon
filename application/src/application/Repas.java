package application;

import java.util.ArrayList;

/**
 * Repas cr�e l'objet Repas et les m�thodes n�c�ssaires pour y ajouter des
 * aliments et en r�cup�rer des informations.
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
	 * Cr�e le type d'objet Repas, array d'aliments
	 * 
	 * @param type
	 * 
	 */
	public Repas(TypeRepas type) {
		repas = type;
		alimentsRepas = new ArrayList<Aliment>();
	}

	/**
	 * Prend un aliment et l'ajoute � un repas.
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
