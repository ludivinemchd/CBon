package application;


import java.util.ArrayList;

//classe representant la base de donn�es

/**
* @author Ludivine La classe BaseAliments cree un Array d'aliments, la "base de
*         données" d'aliments de l'application. (On ajoute aussi directement
*         quelques aliments)
*/
public class BaseAliment {

	ArrayList<Aliment> baseAliments = new ArrayList<Aliment>();

	/*
	 * Grace au constructeur ont cree une base de donnees , et dans le constructeur
	 * ont creee les aliments et on les ajoute dans la base
	 */
	BaseAliment() {
		Aliment oeuf = new Aliment("oeuf", 12.5, 0.3, 10.5, 145.7);
		oeuf.ajouterType("dur");
		oeuf.ajouterType("entier");
		Aliment nouilles = new Aliment("nouilles", 5.06, 21.44, 0.1, 99);
		nouilles.ajouterType("pates");
		nouilles.ajouterType("japonaises");
		nouilles.ajouterType("soba");
		nouilles.ajouterType("cuites");
		Aliment pomme = new Aliment("pomme", 0.26, 13.81, 0.17, 52);
		pomme.ajouterType("crue");
		pomme.ajouterType("avec peau");
		Aliment riz = new Aliment("riz", 2.36, 28.73, 0.19, 130);
		riz.ajouterType("blanc");
		riz.ajouterType("grain court");
		riz.ajouterType("cuit");
		baseAliments.add(oeuf);
		baseAliments.add(nouilles);
		baseAliments.add(pomme);
		baseAliments.add(riz);

	}

	/**
	 * ajoutAlimentBase prend
	 * 
	 * @param A un objet de type Aliment et l'ajoute a l'array baseAliments
	 */
	public void ajoutAlimentBase(Aliment A) {
		baseAliments.add(A);
	}

	public void AfficheInfo(String nom) {
		for (int i = 0; i < baseAliments.size(); i++) {
			if (nom.equals(baseAliments.get(i).nomAliment)) {
				System.out.println("Aliment trouvee : Aliment [nom = " + baseAliments.get(i).nomAliment + " "
						+ baseAliments.get(i).typeAliment + ", proteines = " + baseAliments.get(i).proteines
						+ ", glucides = " + baseAliments.get(i).glucides + ", lipides = " + baseAliments.get(i).lipides
						+ ", calories = " + baseAliments.get(i).calories + "]");
			}
		}
	}

	/**
	 * rechercherUnAliment prend
	 * 
	 * @param nom le nom de l'aliment et
	 * @return retourne l'objet aliment de nom correspondant.
	 */
	public Aliment rechercherAliment(String nom) {
		for (int i = 0; i < baseAliments.size(); i++) {
			if (nom.equals(baseAliments.get(i).nomAliment)) {
				return baseAliments.get(i);
			}

		}
		return null;
	}

	public static void main(String[] args) {

		BaseAliment B = new BaseAliment();
		B.rechercherAliment("oeuf");
		B.AfficheInfo("riz");
		B.rechercherAliment("tomate");

	}

}

