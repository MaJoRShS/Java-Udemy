import java.util.Scanner;

public class exercicio_if_else_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores inteiros para validação: ");
		int A = sc.nextInt();
		int B = sc.nextInt();		
		
		//Aqui eu tive que olhar a resposata, mais aqui ele faz uma dupla validação na condição o que facilita para o programa. 
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
	}

}
