package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		/*
		 * Aqui padrão para leitura de arquivo, abre com o bufferedReader que é mais
		 * rapido e dentro dele abre a instancia do FileReader
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			/*
			 * Aqui eu to setando uma lista com o set porque ele obriga todos os itens a
			 * serem unicos claro que eu preciso configurar isso no HashCode and Equals, e
			 * uso o HasSet porque ele de todos é o que faz a busca mais rapida.
			 */
			Set<LogEntry> set = new HashSet<>();

			/*
			 * Aqui começa a leitura do arquivo, eu crio uma string que vai armazenar todas
			 * as linhas, e já mando um while para poder pegar todas as linhas do arquivo
			 * como eu não sei quantas linhas tem.
			 */
			String line = br.readLine();
			while (line != null) {

				/*
				 * Aqui o esquema para poder quebrar o conteúdo da linha em variaveis eu dou um
				 * split pegando pelo espaço, o que faz com que o item 0 seja o nome e o item 1
				 * seja a data.
				 */
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				// já seta como um objeto já dentro da lista Set, o que impede tenha itens
				// duplicados.
				set.add(new LogEntry(username, moment));

				// Depois de ser inserido vai para a proxima linha
				line = br.readLine();
			}

			/*
			 * Aqui ele só tinha colocado o "set.size()" mais eu quiz ver como eu poderia
			 * imprimir itens especificos e como essa parada é um objeto eu preciso mandar
			 * um toString()
			 */
			System.out.println("Total Users: " + set.size());
			System.out.println("Names : " + set.toString());

		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
