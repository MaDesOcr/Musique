package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitaires {

	
	public static int saisieInt() {
		try {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
		catch(InputMismatchException e) {
			return 0;
		}
	}
	
	public static String saisieString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
