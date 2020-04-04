package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {

		String path = "/home/m_j0r/Desktop/git/Java-Udemy/Seção 17/in.txt";

		/*
		 * Aqui instancia as duas classes dentro da chamada do try, o que faz com que eu
		 * não precise mais do método finally, não precise declarar as variaveis como
		 * null, e nem telas dentro do try uma chamando a outra
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}