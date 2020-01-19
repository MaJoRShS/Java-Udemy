package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		
//		Product product = new Product();
//		
//		System.out.println("Enter product data: ");
//		System.out.print("Name: ");
//		product.name = sc.nextLine();
//		
//		System.out.print("Price: ");
//		product.price = sc.nextDouble();
//		
//		System.out.print("Quantity in stock: ");
//		product.quantity = sc.nextInt();
		
		
	//Alterado pela Seção 09 que está mostrando como alterar o comportamento inicial de uma classe mudando seu construtor, obrigando o DEV a passar todos os valores na instanciação da classe.
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("updated data: " + product);
				
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("updated data: " + product);
		
		sc.close();
	}

}
