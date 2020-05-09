package application;

import java.util.HashMap;
import java.util.Map;
import entities.Product;

public class Program {
	public static void main(String[] args) {

		// Padrão
		Map<Product, Double> stock = new HashMap<>();

		/*
		 * Adicionando itens na collection
		 */
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		/*
		 * Isso aqui segundo a lenda é a quantidade desses produtos em estoque
		 */
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

		/*
		 * Isso aqui não tinha na aula dele e nem o toString na classe eu coloquei
		 * porque sou ousada.
		 */
		System.out.println("ALL PRODUCT's:");
		for (Product key : stock.keySet()) {
			System.out.println(key + ": " + stock.get(key));
		}
	}
}