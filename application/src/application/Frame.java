package application;

import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		// Creer une fenetre
		JFrame fenetre ; 
		fenetre = new JFrame ("CBon");
	
		// Lui donner sa taille
		fenetre.setSize (10, 100);

		// Lui dire de terminer le programme 
// quand on clique sur la petite croix
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		// Afficher la fenetre
		fenetre.setVisible(true);
		// Empecher � l'utilisateur de changer 
				// la taille � l'ex�cution
				// (Cette m�thode est h�rit�e de la classe Frame)
				fenetre.setResizable(false);
				fenetre.setBounds (10, 10, 1000, 500);
	}

}
