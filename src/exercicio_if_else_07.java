import java.util.Locale;
import java.util.Scanner;

public class exercicio_if_else_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores dos eixos X e Y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		
		
		if(x == 0 || y == 0) {
			System.out.println("Origem");
		}
		else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else {
			System.out.println("Q3");
		}
		
		
		sc.close();
	}

}
