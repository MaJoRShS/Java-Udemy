import java.util.Locale;
import java.util.Scanner;

public class exercicio_pdf_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cod_1, cod_2;
		int qtd_1 , qtd_2;
		double value_1, value_2;
		
		System.out.println("Digite o código da peça, quantidade e valor unitário(nessa ordem ) do produto 1 :");
		cod_1 = sc.nextInt();
		qtd_1 = sc.nextInt();
		value_1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça, quantidade e valor unitário(nessa ordem ) do produto 2 :");
		cod_2 = sc.nextInt();
		qtd_2 = sc.nextInt();
		value_2 = sc.nextDouble();
		
		
		double soma = (value_1 * qtd_1) + (value_2 * qtd_2);
		
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
		
		
		sc.close();

	}

}
