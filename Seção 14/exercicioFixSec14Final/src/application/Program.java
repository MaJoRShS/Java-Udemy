package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Tenho que me lembrar que aqui é List, depois dentro do maior e menor é o tipo
		 * da lista que vai estar atrelado a uma classe, e depois de tudo o nome da
		 * lista, ai quando eu der um new é o ArrayList que eu invoco
		 */
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int qtd = sc.nextInt();
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double medicalExpense = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, medicalExpense));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, numberOfEmployee));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");

		/*
		 * Aqui to percorendo a lista para poder apresentar os valores que cada elemento
		 * da minha lista tem ·
		 */
		for (Person person : list) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.calculateTax()));
		}

		/*
		 * Aqui como eu to trabalahando com uma lista que vem de uma super classe
		 * generica eu consigo fazer um loop e somar todos os valores e acrescentar em
		 * uma variavel.
		 */
		double sum = 0.0;
		for (Person person : list) {
			sum += person.calculateTax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		sc.close();

	}

}
