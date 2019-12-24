

import java.util.Locale;
import java.util.Scanner;

public class aula_36 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos gasta: ");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if(minutos > 100) {
			/*
			 * Dessa forma eu estou fazendo como ele costuma fazer, acho até legal dependendo da situação,
			 * mais com os operadores de atribuição cumulativa fica mais facil.
			 *  */
			//conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da  conta = R$ %.2f%n ", conta);
		
		
		
		
		
		sc.close();
	}

}
