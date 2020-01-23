package application;

import java.util.Scanner;

import entities.Person;

/*
 * Aqui está diferente o meu, mais eu ainda assim cheguei bem perto, e eu só esqueci de fazer o array com 10 quartos.
 * 
 * Esse é o que eu fiz, mais não está correto porque não tem as 10 posições, vou criar um igual o dele para consultar depois
 * 
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int qtd = sc.nextInt();

		Person[] vect = new Person[qtd];

		for (int i = 0; i < vect.length; i++) {

			System.out.println("");
			System.out.println("Rent #:" + (i + 1));
			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Email: ");
			String mail = sc.next();

			System.out.print("Room: ");
			int room = sc.nextInt();

			vect[i] = new Person(name, mail, room);

		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i].toString());
		}

		sc.close();
	}

}
