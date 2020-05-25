package application;

import java.util.ArrayList;
import java.util.List;
//Está comentado porque não estou utilizando a opção de prediticado declarado
//import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		
		/*Implementação da interface
		 * Dessa forma estamos instanciando e utilizando a propria classe que implementa a interface predicate.
		 * list.removeIf(new ProductPredicate());
		 */
		
		
		/*Reference method com método estático
		 * list.removeIf(Product::staticProductPredicate);
		 */
		
		
		
		/*Reference method com método não estático
		 * Esse cara aqui trabalha com o produto da propria instancia e não com o atributo que foi passado.
		 * list.removeIf(Product::noStaticProductPredicate);
		 */
		
		
		/*Expressão lambda declarada
		* Aqui eu estou declarando o meu predicado em uma variavel e ai passo essa variavel como parâmetro
		* Predicate <Product> pred = p ->p.getPrice() >= 100.00;
		* list.removeIf(pred);
		*/
		
		
		
		/*Expressão lambda inline
		 * Aqui temos a verdadeira expressão lambda, e ele explicou o motivo real de isso aqui funcionar.
		 */
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);
		
		
		
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
