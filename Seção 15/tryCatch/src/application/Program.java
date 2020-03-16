package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Aqui é o bloco try-catch, esse cara serve mais ou menos como um if-else só
		 * que para erros, e pelo que eu percebi ele sempre tem que ser declarado o tipo
		 * de erro que pode dar, acho que isso deve demandar bastante conhecimento em
		 * desenvolvimento.
		 */

		/*
		 * Aqui é o bloco que eu quero executar e que pode dar erro ou execeção
		 */
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

			/*
			 * Aqui é onde eu capturo esse erro ou execeção e tomo alguma atitude, no caso
			 * aqui eu to apresentando uma mensagem de que o cara digitou errado e termino o
			 * programa.
			 */
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}
}