package aula_88_vetores2_s10;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];

		/*
		 * Aqui tem um detalhe ele disse que o padrão semantico e o mais aconselhavel é
		 * sempre usar o "array.length" porque o array sempre sabe o proprio tamanho e
		 * você não corre o risco de pegar possição errada e ainda é o mais aconselhavel
		 * porque ai você usa funçães nativas e não fica utilzando variaveis auxiliares
		 * aumentando o consumo de memória. 
		 * 
		 */
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			/*
			 * Aqui que muda na criação de array de referencia, eu tenho que indicar na
			 * posição do meu array o endereço do meu objeto e para fazer isso eu digo que a
			 * posição do meu array vai receber a instancia do meu objeto assim fica tudo
			 * certo.
			 * 
			 */
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("AVERAGE PRICE = %.2f%n ", avg);

		sc.close();
	}

}
