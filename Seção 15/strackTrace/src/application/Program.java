package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	/*
	 * Aqui ele removeu toda a execução do programa e colocou dentro de métodos para
	 * que a explicação ficasse mais didatica.
	 */
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}

	/*
	 * Esse método só serve para chamar o outro método e mostrar que mesmo sendo um
	 * método que chama outro que é possivel rastrear onde deu o erro até na camada
	 * mais profunda do seu programa.
	 */
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	/*
	 * Aqui é o método em questão que está com o stack trace ativo e que vai mostrar
	 * exatamente onde ocorreu o erro, idependente de quantos métodos tenham sido
	 * chamdo antes.
	 */
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}