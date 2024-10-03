package service;

import java.util.ArrayList;

import data.Data;
import model.Groupe;

public class GroupeService {
	
	public ArrayList<Groupe> getAllGroupes(){
		return Data.getAlGroupes();
	}

	public void saveGroupe(Groupe groupe) {
		Data.getAlGroupes().add(groupe);
	}
	
	public Groupe getGroupeByName(String name) {
		for(Groupe g: Data.getAlGroupes()) {
			if(g.getNom().equals(name)) {
				return g;
			}
		}
		return null;
	}
	
	public void deleteGroupe(Groupe g) {
		Data.getAlGroupes().remove(g);
	}
	
}
