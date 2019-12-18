import java.util.Locale;
import java.util.Scanner;

public class exercicio_pdf_06 {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter three values ​​for the calculations");
		double pi = 3.14159;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double traingulo = A * C / 2;
		double circulo   = pi * Math.pow(C,2);
		double trapezio  = (A + B) * C / 2;
		double quadrado  = B * B;
		double retangulo = A * B;

		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("TRIANGULO : %.3f%n",traingulo);
		System.out.printf("CIRCULO   : %.3f%n",circulo);
		System.out.printf("TRAPEZIO  : %.3f%n",trapezio);
		System.out.printf("QUADRADO  : %.3f%n",quadrado);
		System.out.printf("RETANGULO : %.3f%n",retangulo);
		
		
		sc.close();
	}

}
