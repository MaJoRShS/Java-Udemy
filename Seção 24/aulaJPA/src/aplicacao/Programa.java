package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Lucas Rodrigues", "lukas.mr@hotmail.com");
		Pessoa p2 = new Pessoa(2, "Fernanda Rodrigues", "fernanda.mr@hotmail.com");
		Pessoa p3 = new Pessoa(3, "Arthur Rodrigues", "arthur.mr@hotmail.com");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
