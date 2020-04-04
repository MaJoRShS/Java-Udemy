package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		/*
		 * • Cria/recria o arquivo: new FileWriter(path) • Acrescenta ao arquivo *
		 * existente: new FileWriter(path, true)
		 */

		// Aqui é o texto a ser inserido dentro do arquivo
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		// Caminho de onde o arquivo vai ser incrementado ou criado
		String path = "/home/m_j0r/Desktop/git/Java-Udemy/Seção 17/out.txt";

		/*
		 * Aqui vem a parada instancia o buffer com o file como parâmetro e ai tem a
		 * parada do "FileWriter()" se quiser que ele não recrie o arquivo pasa como
		 * parametro também o true, assim ele só vai "engordar" o arquivo
		 */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			/*
			 * Esse for é porque o comando "write()" que é nativo do BufferedWrite não tem
			 * quebra de linha ai tem que usar o "newLine()" se não vai escrever a porra
			 * toda na mesma linha
			 */
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
