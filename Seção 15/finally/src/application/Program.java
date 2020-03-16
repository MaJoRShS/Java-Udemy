package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		/*
		 * Ainda não vimos como se manipular arquivos no JAVA mais esse cara aqui serve
		 * para pegar um arquivo abrir ele.
		 */
		File file = new File("C:\\temp\\in.txt");

		/*
		 * O Scanner aqui serve para ler o conteúdo do arquivo, é o Scanner é bolado.
		 */
		Scanner sc = null;

		/*
		 * Aqui nesse bloco de try ele disse que isso aqui é padrão para leitura de
		 * arquvios que aqui ele vai se houver arquivo ele vai ler o arquivo linha a
		 * linha pulando ele no final da linha
		 */
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

			/*
			 * Aqui tem uma mensagem de erro caso o arquivo não exista, e esse
			 * "e.getMessage()" é o padrão para exibir a mensagem do erro, "e" é o nome do
			 * objeto onde ocorreu o erro, e "getMessage()" é o método da classe
			 * "IOExeception".
			 */
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}

		/*
		 * Ai Aqui vem o bloco "finally" que sever como um "default" do case , para caso
		 * de certo ou errado de qualquer maneira ele vai executar esse bloco antes de
		 * encerrar a aplicação.
		 */
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}