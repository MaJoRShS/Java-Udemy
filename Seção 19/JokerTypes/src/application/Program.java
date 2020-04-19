package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui ele setou uma lista de inteiros e como o método que imprime é do tipo
		 * generico ele permite que eu instancie as duas listas e imprima qualquer uma
		 * delas mesmo que sendo de tipos diferentes
		 */
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Bob", "Lucas");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}