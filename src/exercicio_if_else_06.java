import java.util.Locale;
import java.util.Scanner;

public class exercicio_if_else_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para ser validado: ");
		double value = sc.nextDouble();
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");

		
//Infelizmente mais uma vez minha logica me abandonou, ou eu fui seguir o exemplo antigo, mais mesmo assim era ter focado e eu acho que  teria feito.
		if (value < 0.0 || value > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (value <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (value <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (value <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
	

}
