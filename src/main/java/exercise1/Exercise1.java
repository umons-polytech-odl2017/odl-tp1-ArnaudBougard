package exercise1;

import java.util.Scanner;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return null;
	}

	public static void main(String[] args) {

		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		Person Someone;

		System.out.print("What's the name of the person we're talking about? ");

		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		System.out.print("How old is he/she? ");

		Scanner sc2 = new Scanner(System.in);
		int i = sc2.nextInt();

		Someone = createPerson(n,i);

		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.

		System.out.print(Someone.getName());
		System.out.print(Someone.getAge());

	}
}
