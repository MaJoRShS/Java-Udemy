import java.util.Locale;
import java.util.Scanner;

public class exercicio_while_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		int senha = sc.nextInt();
		while(senha != 2002){
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("                                    RESULTADO                                 ");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                    RESULTADO                                 ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Acesso Permitido");
		
		
		
		
		
		sc.close();
	}

}
