package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.App;
import data.Data;
import model.Groupe;
import utils.Utilitaires;

public class Main {

	public static void main(String[] args) {

		Data.getAlGroupes().add(new Groupe("ACDC", "ROCK", 4));
		Data.getAlGroupes().add(new Groupe("Beatles", "ROCK", 4));
		Data.getAlGroupes().add(new Groupe("Rolling Stones", "ROCK", 4));
		Data.getAlGroupes().add(new Groupe("ACDC", "ROCK", 4));

		App app = new App();
		app.launch();
		
	}
}
