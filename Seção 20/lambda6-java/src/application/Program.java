package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		
		
		 //Padrão para leiturda de arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();
			
			
			//padrão para leitura linha a linha do arquivo.
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			
			/*
			 * Aqui ele cria a stream com o resultado do que foi lido do arquivo, ai
			 * tem o map que vai pegar os valores e depois ele manda o reduce 
			 * que faz o calculo dos valores encontrados,e ainda divide pela quantidade
			 * de itens na lista
			 */
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			
			/*
			 * Aqui ele usou um comparator porque ele queria pegar os nomes que estavam na lista
			 * e devolvelos em ordem, e como o comparator tem um método que devolve o nome ao contrario
			 * do que foi pesquisado tudo certo. 
			 */
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName()).sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
