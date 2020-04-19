package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		/*
		 * Aqui a lista rebebeu o produto, mais a classe está esperando um tipo generico
		 */
		List<Product> list = new ArrayList<>();

		String path = "/home/m_j0r/Desktop/git/Java-Udemy/Seção 19/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				 //Aqui o padrão de busca de quebrar os campos na virgula
				 
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
