import java.util.Locale;
import java.util.Scanner;

public class exercicio_youtube {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = base * altura ;
		double preco = area * metroQuadrado;
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("AREA   = %.2f%n", area);
		System.out.printf("PRECO  = %.2f%n", preco);
		
		
		
		sc.close();
		
	}
	

}
