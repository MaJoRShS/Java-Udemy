package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Setou uma lista para poder trabalhar mais tarde
		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		// Jogo o que foi digitado para essa variavel
		File sourceFile = new File(sourceFileStr);

		// Depois pega o diretorio apenas de onde está o arquivo
		String sourceFolderStr = sourceFile.getParent();

		// Cria o diretório out dentro do diretório onde está o arquivo
		boolean success = new File(sourceFolderStr + "/out").mkdir();

		// aqui ele monta uma variavel com o nome completo de onde vai ficar o outro
		// arquivo e o nome do outro arquivo
		String targetFileStr = sourceFolderStr + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			// Move todo conteudo para essa variavel
			String itemCsv = br.readLine();
			while (itemCsv != null) {

				// aqui ele quebra pela virgula, e fala para onde vai cada um dos itens
				// informando a posição mesmo
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				// instancia o objeto direto no loop
				list.add(new Product(name, price, quantity));

				// vai para a proxima linha
				itemCsv = br.readLine();
			}

			/*
			 * Começa a montar o arquivo de destino
			 */
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				/*
				 * como é uma lista de objetos ele vai fazer um loop na lista chamando os
				 * metodos do proprio obj
				 */
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				// tudo certo aparece isso
				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				// erro na criação do arquivo
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			// erro na leitura do arquivo original
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}