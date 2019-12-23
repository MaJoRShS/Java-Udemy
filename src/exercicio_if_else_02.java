import java.util.Scanner;

public class exercicio_if_else_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro para ser verificado: ");
		int x = sc.nextInt();
		int result = x % 2;
		
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		
		if(result == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
				
		sc.close();
	}

}
