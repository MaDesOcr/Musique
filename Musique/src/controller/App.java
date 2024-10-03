package controller;

import data.Data;
import model.Groupe;
import utils.Utilitaires;

public class App {
	boolean appOn = true;

	public void launch() {
		System.out.println("Bonjour");
		
		while(appOn) {
			System.out.println("Outil de gestion de Groupe de musique");
			System.out.println("Menu : ");
			System.out.println("1 Afficher la liste de groupe");
			System.out.println("2 Ajouter un groupe");
			System.out.println("3 Sortir");
			
			String choixMenu = Utilitaires.saisieString();
			switch(choixMenu) {
				case "1" : System.out.println(Data.getAlGroupes());
					break;
				case "2" : System.out.println("Creation d'un groupe");
					System.out.println("Quel est son nom : ");
					String nom = Utilitaires.saisieString();
					System.out.println("Quel est son genre : ");
					String genre = Utilitaires.saisieString();
					System.out.println("Quel est le nombre de membre : ");
					int nbMembre = Utilitaires.saisieInt();
					Data.getAlGroupes().add(new Groupe(nom, genre, nbMembre));
					break;
				case "3" :
					appOn = false;
					System.out.println("Au revoir");
					break;
				default :;
			}			
		}
	}
}
