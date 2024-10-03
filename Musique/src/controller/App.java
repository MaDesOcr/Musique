package controller;

import data.Data;
import model.Groupe;
import service.GroupeService;
import utils.Utilitaires;

public class App {
	boolean appOn = true;

	GroupeService groupeService = new GroupeService();
	
	public void launch() {
		System.out.println("Bonjour");
		
		while(appOn) {
			System.out.println("Outil de gestion de Groupe de musique");
			System.out.println("Menu : ");
			System.out.println("1 Afficher la liste de groupe");
			System.out.println("2 Ajouter un groupe");
			System.out.println("3 Delete un groupe");
			System.out.println("4 Update un groupe");
			System.out.println("5 Sortir");
			
			String choixMenu = Utilitaires.saisieString();
			switch(choixMenu) {
				case "1" : System.out.println(groupeService.getAllGroupes());
					break;
				case "2" : System.out.println("Creation d'un groupe");
					System.out.println("Quel est son nom : ");
					String nom = Utilitaires.saisieString();
					System.out.println("Quel est son genre : ");
					String genre = Utilitaires.saisieString();
					System.out.println("Quel est le nombre de membre : ");
					int nbMembre = Utilitaires.saisieInt();

					Groupe groupeToSave = new Groupe(nom, genre, nbMembre);
					groupeService.saveGroupe(groupeToSave);
					
					break;
				case "3" : 
					System.out.println("Saisie le nom du groupe à supprimer");
					String nomToDelete = Utilitaires.saisieString();
	
					Groupe gToDelete = groupeService.getGroupeByName(nomToDelete);
					if(gToDelete!=null) {
						groupeService.deleteGroupe(gToDelete);
					}
					
					break;

				case "4":
					System.out.println("Saisie un nom de groupe pour en modifier le nb de membre");
					String nomToUpdate = Utilitaires.saisieString();
					
					Groupe groupeToUpdate = groupeService.getGroupeByName(nomToUpdate);
					if(groupeToUpdate!=null) {
						System.out.println("Nouveau nb de membre du groupe "
								+ nomToUpdate);
						int newNbMembre = Utilitaires.saisieInt();
						//curiosité à voir, problème de update
						groupeToUpdate.setNbMembre(newNbMembre);
						
					}					

					break;
				case "5" :
					appOn = false;
					System.out.println("Au revoir");
					break;
				default :;
			}			
		}
	}
}
