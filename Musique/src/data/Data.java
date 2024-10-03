package data;

import java.util.ArrayList;
import model.Groupe;

public class Data {

	private static ArrayList<Groupe> alGroupes = new ArrayList<Groupe>();
	

	public static ArrayList<Groupe> getAlGroupes() {
		return alGroupes;
	}

	public static void setAlGroupes(ArrayList<Groupe> alGroupes) {
		Data.alGroupes = alGroupes;
	}
	
	
	
	
	
}
