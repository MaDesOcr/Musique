package model;

public class Groupe {

	String nom;
	String genre;
	int nbMembre;
	
	public Groupe() {
		super();
	}

	public Groupe(String nom, String genre, int nbMembre) {
		super();
		this.nom = nom;
		this.genre = genre;
		this.nbMembre = nbMembre;
	}

	@Override
	public String toString() {
		return "Groupe [nom=" + nom + ", genre=" + genre + ", nbMembre=" + nbMembre + "]";
	}
	
}
