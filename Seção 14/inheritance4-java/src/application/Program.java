package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Saporra aqui eu preciso focar em aprender , além de lista em array e matrizes
		 * , que mais do mesmo.
		 * 
		 * só que aqui ele já instancia uma lista do tipo certo e já deixa ela como
		 * ArrayList para poder percorrer ela mais facilmento depois.
		 */
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			/*
			 * Aqui tá o pulo do gato, baseando no que for respondido no "char" ele vai usar
			 * o if e vai instanciar o cara direto na lista sem precisar passar ele para uma
			 * variavel ou objeto fazendo assim com que eu ganhe alguns milisegundos na
			 * instanciação e possivel realocação na lista, eu já crio la e fica tudo certo.
			 */
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				/*
				 * Aqui a parada de instanciar um objeto direto dentro de uma lista sem passar
				 * por lugar nenhum.
				 */
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}
}
