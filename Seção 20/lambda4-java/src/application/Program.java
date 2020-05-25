package application;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
//import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		/*Implementação da interface
		 * 
		 * Aqui ele ta pegando uma lista do tipo "product" e tranformando ela em uma stream, ai aquela função "map()" 
		 * ela aplica uma função a todos os itens de uma steam, e por sua vez tranforma a lista em uma nova lista
		 * com todos os itens já tranformados, e ai para poder voltar a ser uma lista tem que usar esse  ".collect(Collectors.toList()"
		 * List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		 */
		
		
		
		/*Reference method com método estático
		 * Aqui a diferença é que no "map" eu passo direto o nome do método statico e não mais uma função
		 * List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		 */
		
		
		
		/*Reference method com método não estático
		 * List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		 */
		
		
		
		/*Expressão lambda declarada
		 * Aqui ainda acho boroca porque preciso declarar a expressão lambda em algum lugar para depois utilizar,
		 * mais deve servir quando se precisar passar alguma coisa como referencia
		 * 
		 * Function<Product, String> func = p -> p.getName().toUpperCase();
		 * 
		 * List<String> names = list.stream().map(func).collect(Collectors.toList());
		 */
		

		//Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
