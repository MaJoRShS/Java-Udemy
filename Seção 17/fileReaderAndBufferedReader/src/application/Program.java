package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {

		/*
		 * Segundo ele está de uma forma muito verbosa, mais a implementação vai ficar
		 * mais simples
		 * 
		 * Aqui primeiro ele informa o caminho do arquivo em uma variavel
		 */
		String path = "/home/m_j0r/Desktop/git/Java-Udemy/Seção 17/in.txt";
		/*
		 * Instancia o FileReader e o BufferedReader como nullo para já telos no escopo
		 * global
		 */
		BufferedReader br = null;
		FileReader fr = null;
		try {

			/*
			 * Aqui ele le o arquivo com o FileReader e já passa esse FileReader para o
			 * BufferedReader para otimizar a leitura
			 */
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			// Aqui ele vai ler linha a linha do arquivo, e quando chegar na ultima linha
			// ele devolve nullo.
			String line = br.readLine();

			/*
			 * Aqui se não for nullo ele imprime o conteudo na tela a linha, e pula para a
			 * proxima até chegar no final
			 */
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		// Erro padrão
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		/*
		 * Aqui que da ruim , porque pode ser que de um erro na hora de fechar as stream
		 * de leitura, ai o que ele faz, valida se está diferente de nula, se tiver ele
		 * fecha e tudo certo, mais se ser um erro no fechamento ele estoura uma
		 * exception.
		 */
		finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}