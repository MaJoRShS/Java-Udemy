package services;

import java.util.List;

public class CalculationService {

	/*
	 * Aqui ele criou uma lista de tipo generico e foi obrigado a declarar que essa
	 * classe é um comparable te tipo generico também, e ai sim eu consigo utilizar
	 * uma lista generica e comparar os intens de dentro
	 */
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
