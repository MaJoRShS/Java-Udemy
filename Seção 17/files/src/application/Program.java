package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui to instaciando um tipo file,esse cara é padrão do java, e serve para
		 * vocẽ indicar o caminho do arquivo.
		 */
		File file = new File("/home/m_j0r/Desktop/git/Java-Udemy/Seção 17/in.txt");

		/*
		 * Instanciou como nullo porque vamos ler um arquivo e não o console.
		 */
		Scanner sc = null;

		/*
		 * Como pode ser que ao tentar ler o arquivo de algu erro, e pode dar varios, a
		 * leitura do conteudo tem que estar dentro de um bloco try catch
		 */
		try {
			/*
			 * Aqui já abre e le o conteudo do arquivo, e o "sc.hasNextLine()" identifica se
			 * tem uma nova linha no arquivo e le ela.
			 */
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		/*
		 * Mensagem de erro padrão de leitura de arquivo
		 */
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		/*
		 * Aqui só tem isso porque é uma boa pratica você colocar o close, e como pode
		 * ser que não exista nesse contexto você meio que valida se existe a abertura,
		 * ai você manda o close.
		 */
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
