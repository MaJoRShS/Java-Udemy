package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();

			
			/*
			 * Criou uma lista chamada de emails e jogou para dentro dela a lista de stream
			 * onde ele filtou buscando por todos que tenham o salario maior que o salario digitado
			 * ai faz uma nova lista pegando só os emails dessas pessoas que atenderam a condição
			 * e usa o sorted para ordenar a lista em ordem alfabetica
			 * e depois retorna a lista.
			 */
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());

			//Aqui ele ainda usa o salario que foi digitado para poder mostrar no texto.
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			//printa todos os itens da lista
			emails.forEach(System.out::println);

			
			/*
			 * Aqui ele pega a mesma lista inicial para poder filtrar todos que comecem com a letra M
			 * no seu nome com o map, e com o reduce ele soma só os salario de quem começa com M. 
			 */
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0,(x, y) -> x + y);

			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}