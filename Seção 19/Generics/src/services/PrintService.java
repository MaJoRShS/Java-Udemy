package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	/*
	 * Aqui ele ta setando a lista com o tipo generico o que faz com que a lista
	 * assuma tipo que for informado na instancia, fazendo também com que todos os
	 * tipos de dados funcionem com todas as operações
	 */
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
