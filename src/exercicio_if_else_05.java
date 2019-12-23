import java.util.Locale;
import java.util.Scanner;

public class exercicio_if_else_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o Código do seu produto e a quantidade desejada: ");
		int code = sc.nextInt();
		int qtd = sc.nextInt();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		
		
		if(code == 1 ) {
			double total = qtd * 4.00;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if(code == 2) {
			double total = qtd * 4.50;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if(code == 3) {
			double total = qtd * 5.00;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if (code == 4) {
			double total = qtd * 2.00;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if (code == 5) {
			double total = qtd * 1.50;
			System.out.printf("TOTAL: R$ %.2%n", total);
		}
		sc.close();
	}

}
