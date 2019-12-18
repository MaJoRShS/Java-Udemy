import java.util.Locale;
import java.util.Scanner;

public class exercicio_pdf_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee number: ");
		int number = sc.nextInt();
		System.out.println("Enter worked hours: ");
		int hour = sc.nextInt();
		System.out.println("Enter time value: ");
		double value = sc.nextDouble();
		

		double salary = value * hour;
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("NUMBER  = " + number);
		System.out.printf("SALARY  =  U$ %.2f %n", salary);
		
		
		
		sc.close();

	}

}
