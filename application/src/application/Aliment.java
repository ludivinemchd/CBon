package application;

import java.util.ArrayList;

/**
 * @author Ludivine La classe Aliment cree le type Objet Aliment, qui contient
 *         la quantité de plusieurs nutriments en mg proteines glucides lipides
 *         ainsi que les calories en kcal
 */
public class Aliment {
	protected String nomAliment;
	protected ArrayList<String> typeAliment = new ArrayList<String>();

	protected double calories, proteines, glucides, lipides;

	// les valeurs des nutriments sont renseignees pour 100g, les calories sont
	// indiquees en kcal
	Aliment(String nomAliment, double proteines, double glucides, double lipides, double calories) {
		this.nomAliment = nomAliment;
		this.proteines = proteines;
		this.glucides = glucides;
		this.lipides = lipides;
		this.calories = calories;
	}

	public void ajouterType(String nomtype) {
		typeAliment.add(nomtype);
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
