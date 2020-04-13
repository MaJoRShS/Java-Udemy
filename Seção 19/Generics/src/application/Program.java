package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Aqui é onde eu declaro o tipo de lista que vai ser , se eu declarar ela como
		 * string e todas as paradas como string ele vai virar uma lista de string,
		 * mesmo sendo uma lista de "PrintService" ela ainda é uma lista generica o que
		 * eu passar ali vira o tipo dela
		 */
		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
