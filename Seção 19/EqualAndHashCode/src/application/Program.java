package application;

import enitities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		/*
		 * Aqui primeiro pegamos o hashcode porque ele é mais rapido, e ai depois
		 * verificamos se são identicos.
		 */
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));

		/*
		 * Aqui da falso porque esse "==" verifica também se esses caras estão apontando
		 * para a mesma instancia de memoria, o que não é verdade porque são dois
		 * objetos diferentes
		 */
		System.out.println(c1 == c2);

		/*
		 * Aqui da maneira que está o JAVA intende que são sim iguais porque foi
		 * declarado literalmente, se fosse dois objetos do tipo String instanciados
		 * mesmo com o mesmo valor teriam instancias diferentes na memoria heap o que
		 * faria com fossem diferenes
		 */
		System.out.println(s1 == s2);

	}

}
