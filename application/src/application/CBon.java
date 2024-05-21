package application;

import java.text.SimpleDateFormat;
import java.util.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * La classe Cbon contient le Menu interactif, les différents affichages ainsi
 * que l'ajout d'un aliment à un repas.
 * 
 * @author Hanaa
 *
 */
public class CBon {

	static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	static Date date = new Date(System.currentTimeMillis());

	/**
	 * methode qui sert a afficher le menu de l'application
	 */
	public static void affiche_debut() {
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------     Application  CBon     ---------------");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("--------    Calcul des calories repas   -------");
		System.out.println("-----------------------------------------------");
	}

	//
	/**
	 * AjoutAliments ajoute un aliment a un repas choisi
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param NomAliment
	 * @param S
	 * @param B
	 */
	public static void AjoutAliments(Repas a, Repas b, Repas c, Repas d, String NomAliment, Scanner S, BaseAliment B) {

		int choixRepas = 0; // variable qui sert a definir le repas choisi la l'utilisateur dans le case
							// switch
		Aliment A;

		// Print pour la mise en forme et pour communiquer avec l'utilisateur
		System.out.println(" Vous avez choisi d'ajouter un aliment");
		System.out.println(" Veuillez saisir le nom de l'aliment :");
		System.out.println();

		NomAliment = S.next();// Récupere le nom de l'aliment entré par l'utilisateur

		System.out.println();
		System.out.println(" Vous avez saisi : " + NomAliment);

		B.AfficheInfo(NomAliment); // Affiche les informations de l'aliment entré par l'utilisateur s'il est trouvé
		A = B.rechercherAliment(NomAliment);

		// Print pour la mise en forme et pour communiquer avec l'utilisateur
		System.out.println(" Veuillez choisir un repas : ");
		System.out.println(" 1 : Petit dejeuner ");
		System.out.println(" 2 : Dejeuner  ");
		System.out.println(" 3 : Gouter  ");
		System.out.println(" 4 : Diner  ");
		System.out.println();

		choixRepas = S.nextInt();// Recupére le choix de l'utilisateur

		System.out.println();
		System.out.println(" Vous avez choisi : " + choixRepas);

		// un switch case qui sert a ajouter l'aliment dans le repas choisi par
		// l'utilisateur
		switch (choixRepas) {
		case 1:
			a.ajouterAliment(A); // Ajoute l'aliment dans : Petit dejener
			break;
		case 2:
			b.ajouterAliment(A); // Ajoute l'aliment dans : Dejener
			break;
		case 3:
			c.ajouterAliment(A); // Ajoute l'aliment dans : Gouter
			break;
		case 4:
			d.ajouterAliment(A); // Ajoute l'aliment dans : Diner
			break;
		default:

			// En cas d'erreurs
			System.out.println(" Eurror : Veuillez choisir le numero corespondant a un repas la porchaine fois ! ");

		}

	}

	/**
	 * Affiche le menu
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param NomAliment
	 * @param S
	 * @param B
	 */
	public static void affiche_Menu(Repas a, Repas b, Repas c, Repas d, String NomAliment, Scanner S, BaseAliment B) {

		int choix = 0; // une variable ou va etre stocke le choix de l'utilisateur
		boolean quitter = false;
		while (quitter == false) {

			// Print pour la mise en forme et pour communiquer avec l'utilisateur
			System.out.println(" Veuillez choisir :  ");
			System.out.println(" 0 : Pour Quitter ");
			System.out.println(" 1 : Ajouter un aliment ");
			System.out.println(" 2 : Afficher le bilan actuel de la journee ");
			System.out.println();

			choix = S.nextInt();// Recupére le choix de l'utilisateur
			System.out.println();

			// un switch case qui sert a ajouter l'aliment dans le repas choisi par
			// l'utilisateur
			switch (choix) {

			//
			case 0: // L'utilisateur décide de quitter
				System.out.println("A bientot !");
				quitter = true; // pour sortire de la boucle
				break;
			case 1:
				AjoutAliments(a, b, c, d, NomAliment, S, B); // l'utilisateur choisi d'ajoutée un element dans un repas
				break;
			case 2:
				affiche_Billan(a, b, c, d); // l'utilisateur choisi d'afficher le bilan de la journée
				break;
			default:
				System.out.println(" Eurror : Veuillez choisir le numero corespondant a un choix la porchaine fois ! ");

			}

		}

	}

	/**
	 * Affiche le bilan de la journée
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public static void affiche_Billan(Repas a, Repas b, Repas c, Repas d) {

		double Total = a.getCalories() + b.getCalories() + c.getCalories() + d.getCalories();
		System.out.println(" -- Bilan actuel de la journee ");
		System.out.println(" -- " + formatter.format(date));
		System.out.println(" Petit Dejeuner : " + a.getCalories() + "Kcal");
		System.out.println(" Dejeuner : " + b.getCalories() + "Kcal");
		System.out.println(" Collation : " + c.getCalories() + "Kcal");
		System.out.println(" Diner : " + d.getCalories() + "Kcal");
		System.out.println(" TOTAL consomme : " + Total + "Kcal");
		System.out.println();

	}

	public static void main(String[] args) {

		// -----------------------------------------------------
		// PARTIE MODELE
		// -----------------------------------------------------

		Repas PetitDej = new Repas(TypeRepas.PETIT_DEJ);
		Repas Dejener = new Repas(TypeRepas.DEJUNER);
		Repas Gouter = new Repas(TypeRepas.GOUTER);
		Repas Dinner = new Repas(TypeRepas.DINER);
		BaseAliment B = new BaseAliment();
		String NomAliment = "vide";
		Scanner S = new Scanner(System.in);

		// -----------------------------------------------------
		// PARTIE VUE
		// -----------------------------------------------------

		affiche_debut();
		System.out.println();

		// -----------------------------------------------------
		// PARTIE CONTROLEUR
		// -----------------------------------------------------

		affiche_Menu(PetitDej, Dejener, Gouter, Dinner, NomAliment, S, B);

	}

}
