package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
/*
 * Aqui já começa a orientação a objeto, eu criei um classe que triangulo que quando eu passo parametros cria um objeto do tipo triangle 
 * e que me permite acessar os seus atributos diferente do que eu faço no procedural, mais ainda preciso acessar um a um caso eu queira.
 * 
 *  Na real muda a utilização e simplifica algumas coisas, mais sempre você escreve muito mais código com P O.O
 * 
 * 
 */
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
