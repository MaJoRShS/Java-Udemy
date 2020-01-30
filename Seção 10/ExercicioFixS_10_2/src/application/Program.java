package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	//Lembrando que eu peguei o dele e não consegui fazer o meu.
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Aqui ele seta uma lista do tipo Employee, eu nem tinha lembrado dessa porra,
		 * tenho que estudar mais as paradas das listas e ele usa o ArrayList<>() para
		 * poder trabalhar melhor depois com a lista dele.
		 */
		List<Employee> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			/*
			 * Aqui é um metodo nativo das listas, ele ta adicionando na lista essa nova
			 * "instancia" de Employee
			 */
			list.add(new Employee(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		/*
		 * Aqui parece que é padrão usar o STREAM(), para converter listas para quaquer
		 * coisa e ai eu procuro pelo id que o mano ta digitando para ser acrescido
		 * valor e ai vejo se ta nullo, se tiver eu devolvo falando que não tem esse ID
		 * se existir eu peço a porcentagem de aumento.
		 */
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		//Aqui ele usa o ForEach para printar a lista
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}
}