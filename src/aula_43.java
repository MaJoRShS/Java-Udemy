import java.util.Locale;
import java.util.Scanner;

public class aula_43 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int soma = 0;
		//Aqui ele está fazendo a soma do valor digitado la fora na soma que vem de fora, e ai só depois ele recebe o novo valor de x.
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
