package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * Peguei o dele no github to meio cansado e desanimado do java mais vamo ai
		 */
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		/*
		 * aqui o que muda que a instaciação do funcionario não é normal eu passo o nome
		 * do cara, uso o valor dele no enum mais passo por escrito também, salario, e
		 * por ultimo eu já passo o nome do departamento instanciando um departamento
		 */
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		/*
		 * aqui é mais interessante, porque eu estou instanciando os valores que vou
		 * usar para poder criar o meu contrato e ai eu instancio o contrato, lembrando
		 * que ele pode ter mais de um por isso que está no for
		 */
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			// instancia do contrato com os valores que foram digitados
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			// já vinculo ou faço a associação do meu contrato ao meu trabalhador com o
			// addContratact, e ele vai fazer isso para quantos contratos eu tiver
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		//Aqui ele recortou a data na mão para poder mostrar que tem como, e que não é dificil
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		//já usou os metodos que estam disponiveis nas classes.
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}
}