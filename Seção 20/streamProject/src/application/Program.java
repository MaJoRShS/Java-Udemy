package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui ele criou uma lista de inteiros, transformou a lista em uma stream, e
		 * depois de trabalhar a lista ele tem que converter a string para array para
		 * poder imprimir
		 */
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));

		
		/*
		 * Ainda não sei bem a diferença do "Stream.of" mais parece que tem diferenças no retorno quando se utiliza ele.
		 */
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

		
		/*
		 * esse cara aqui ele faz a iteração de valores baseados em uma expressão que vocẽ indicar 
		 */
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		
		/*
		 * Aqui ele tava de sacanagem e apresentar a formula de fibonacci
		 */
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));

	}

}
