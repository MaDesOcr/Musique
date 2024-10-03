package model;

public class Groupe {

	private String nom;
	private String genre;
	private int nbMembre;
	
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNbMembre() {
		return nbMembre;
	}

	public void setNbMembre(int nbMembre) {
		this.nbMembre = nbMembre;
	}
	
	
	
}
