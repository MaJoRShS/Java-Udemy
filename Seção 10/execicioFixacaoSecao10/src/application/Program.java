package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
		System.out.print("How many rooms will be rented? ");
		int qtd = sc.nextInt();
		
		Person[] vect = new Person[qtd];
		
		for(int i =0; i < vect.length; i++) {
			
		System.out.println("");
		System.out.println("Rent #");
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Email: ");
		String mail = sc.next();
		
		System.out.print("Room: ");
		int room = sc.nextInt();
		
		vect[i] = new Person(name, mail, room);
		
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < vect.length; i++){
		System.out.println(vect[i].toString());
		}
		
		
		sc.close();
	}

}
