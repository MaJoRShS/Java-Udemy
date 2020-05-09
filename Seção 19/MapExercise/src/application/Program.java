package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {

		/*
		 * Aqui é a syntax do map, eu passo o tipo da chave e o tipo do valor, e ai o
		 * nome da collection, e ai ele usou o TreeMap<>() porque ele é o mais rapido do
		 * MAP.
		 */
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");

		/*
		 * Aqui ele remove um item da coleção usando a chave como referencia para
		 * remover.
		 */
		cookies.remove("email");

		/*
		 * E aqui ele mostra que a segunda inserção na coleção sobrescreveu a primeira,
		 * impedindo uma duplicidade de itens mais não mantendo o que foi inserido
		 * primeirament.
		 */
		cookies.put("phone", "99771133");

		/*
		 * Alguns exemplos de parâmetros que podem ser utilizados com o MAP.
		 */
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		/*
		 * E ai ele ta printando todas as chaves que existem dentro dessa collection
		 */
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}