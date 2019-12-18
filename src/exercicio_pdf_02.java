

import java.util.Locale;
import java.util.Scanner;

public class exercicio_pdf_02 {

	public static void main(String[] args) {
		//RAIO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		System.out.println("Digite o valor do diametro a ser calculado: ");
		double diameter = sc.nextDouble();		
		double result = pi * Math.pow(diameter, 2);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("A = %.4f%n", result);
		
		
		
		
		
		
		
		sc.close();

	}

}
