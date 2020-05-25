package application;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

import entities.Product;
//import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		/*
		 * Pelo que eu intendi a classe consumer simplementes executa alguma coisa
		 *  e não devolve nada, é literalmente uma executor
		 */
		
		
		
		/*Implementação da interface
		 *Aqui é a mesma coisa da aula anterior ele criou uma classe que implementa a interface que faz o trabalho. 
		 * list.forEach(new PriceUpdate());
		 */
		
		
		
		
		/*Reference method com método estático
		 * list.forEach(Product::staticPriceUpdate);
		 */
		
		
		
		
		/*Reference method com método não estático
		 * list.forEach(Product::nonStaticPriceUpdate);
		 */
		
		
		
		/*Expressão lambda declarada
		 * Aqui as chaves({}) são opcionais ele só colocou para poder mostrar que podem ser utilizadas ou não.
		 * 
		 * double factor = 1.1;
	     * 
	     * Consumer<Product> cons = p ->{
		 *	p.setPrice(p.getPrice() * factor);
		 *	};
		
		 *	list.forEach(cons);
		 */
		
		
		/*Expressão lambda inline
		 * Aqui pe o método mais utilizado mesmo sendo um consumer é a mesma coisa, a unica diferença é que consumer só faz alguma coisa e não retorna nada
		 */
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		/*
		 * Aqui é o mesmo conceito de Reference method só que com o println
		 */
		list.forEach(System.out::println);
	}
}
