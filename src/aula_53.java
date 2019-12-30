

import java.util.Locale;
import java.util.Scanner;

public class aula_53 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
//		//Primeiro exemplo para ver se o programa está funcionando.
//		System.out.print("Digite a Temperatura em Celsius: ");
//		double C = sc.nextDouble();
//		double F = 9.0 * C / 5.0 + 32.0;
//		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//		System.out.println("Deseja repetir (s/n)? ");
//		
		
		
		
		
		
		
		
		//primeira forma de fazer funcionar mais é porco
//		System.out.print("Digite a Temperatura em Celsius: ");
//		double C = sc.nextDouble();
//		double F = 9.0 * C / 5.0 + 32.0;
//		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//		System.out.println("Deseja repetir (s/n)? ");
//		char resp = sc.next().charAt(0);
//				
//		while (resp != 'n') {
//			System.out.print("Digite a Temperatura em Celsius: ");
//			C = sc.nextDouble();
//			F = 9.0 * C / 5.0 + 32.0;
//			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//			System.out.println("Deseja repetir (s/n)? ");
//			resp = sc.next().charAt(0);
//		}

		
		
		//Segunda forma
//		char resp = 's';
//				
//		while (resp != 'n') {
//			System.out.print("Digite a Temperatura em Celsius: ");
//			double C = sc.nextDouble();
//			double F = 9.0 * C / 5.0 + 32.0;
//			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//			System.out.println("Deseja repetir (s/n)? ");
//			resp = sc.next().charAt(0);
//		}
		
		
		//Terceira e com o do while.
				char resp;
		do {
			System.out.print("Digite a Temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		}while(resp != 'n');
		//Aqui sempre executa o bloco de comando porque a validação está no final da execução. 
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
