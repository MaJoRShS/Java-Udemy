import java.util.Locale;
import java.util.Scanner;

public class exercicio_pdf_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Entre com 4 valores inteiros");
		System.out.println("Digite o primeiro valor: ");
		int A = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int B = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int C = sc.nextInt();
		
		System.out.println("Digite o quarto valor: ");
		int D = sc.nextInt();
		
		int result = (A * B) - (C * D);
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(result);
		
		
		
		sc.close();
		
	}

}
