package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	/*
	 * Exemplo 01
	 */
	
	
//	public static final double PI = 3.14159;
//
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter radius: ");
//		double radius = sc.nextDouble();
//
//		double c = circumference(radius);
//
//		double v = volume(radius);
//
//		System.out.printf("Circumference: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", PI);
//
//		sc.close();
//	}
//
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//
//	// Já nesse exemplo eu escolhi usar o "Math.pow()" por escolha minha, ele usou o
//	// "radius * radius * radius".
//	public static double volume(double radius) {
//		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
//	}

	
	
	
	
	/*
	 * Exemplo 02
	 */
	
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter radius: ");
//		double radius = sc.nextDouble();
//		Calculator calc = new Calculator();
//
//		double c = calc.circumference(radius);
//
//		double v = calc.volume(radius);
//
//		System.out.printf("Circumference: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", calc.PI);
//		
//		sc.close();
//		}

	
	/*
	 * Exemplo 03
	 */
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
		}
	
	
	
	
	
	
}
