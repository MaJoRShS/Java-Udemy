package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		// Copiei o dele na cara dura
		Scanner sc = new Scanner(System.in);

		/*
		 * aqui ele usa o LinkedHashMap porque ele é o que tem a velocidade de procura
		 * intermediaria
		 */
		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		// Inicio padrão de leitura de arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			/*
			 * esquema padrão para leitura de linha a linha do arquivo e armazenar dentro da
			 * varial line, e como ele não sabe ao certo quantas linhas vai ter no arquivo
			 * se usa o while para poder fazer a leitura de tudo.
			 */
			String line = br.readLine();
			while (line != null) {

				/*
				 * padrão também para quebrar os campos da linha separando por virgula
				 */
				String[] fields = line.split(",");
				String name = fields[0];
				/*
				 * e aqui tem que fazer o parseInt porque o campo que vem deve ser um inteiro
				 */
				int count = Integer.parseInt(fields[1]);

				/*
				 * Aqui ele vai pegar e verificar qual é o nome que está na chave e atrás desse
				 * primeiro nome ele vai pegar o valor e sobrescrever esse valor dentro da
				 * lista, sendo assim ele sempre vai acrescentar o novo valor encontrado na
				 * lista, e nunca vai duplicar os indices.
				 */
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				} else {
					votes.put(name, count);
				}

				line = br.readLine();
			}

			/*
			 * Aqui ele vai printar toda a nova lista que foi formada com os valores
			 * somarizados.
			 */
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}