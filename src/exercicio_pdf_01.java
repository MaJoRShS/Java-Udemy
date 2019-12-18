import java.util.Locale;
import java.util.Scanner;

public class exercicio_pdf_01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	 Locale.setDefault(Locale.US);
	 
	System.out.println("digite o primeiro valor");
	int a = sc.nextInt();
	System.out.println("digite o segundo valor");
	int b = sc.nextInt();
	
	int soma = a + b;
	
	System.out.println("------------------------------------------------------------------------------");
	System.out.println("                                    RESULTADO                                 ");
	System.out.println("------------------------------------------------------------------------------");
	
	System.out.println("SOMA = " + soma);
	 
	 
	 
	 
	 sc.close();
	 

	}

}
