package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ProductService {

	/*
	 * Aqui está o pulo do gato, porque ele está passando o predicado como parâmetro
	 * da função, ou seja qualquer predicado que eu passar na chama da função vai
	 * funcionar e eu nõa vou precisar mais ficar alterando a função.
	 */
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
