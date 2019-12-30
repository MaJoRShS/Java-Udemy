import java.util.Scanner;

public class aula_48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

//Aqui o valor de "n" so serve de parâmetro para saber quantas vezes vai ser digitado numeros pelo usuario
		int n = sc.nextInt();
		int soma = 0;

//Aqui eu pego o valor que foi digitado e acrescento em uma variavel soma, e como eu já disse quantas vezes eu vou fazer isso eu uso o for.
		for (int i=0; i < n; i++) {
			int x = sc.nextInt();
			//Aqui eu usei o += porque é a mesma coisa que  (soma = soma + x) e prefiro me acostumar a usar assim.
			soma += x;
			
		}
		System.out.println("valor somado: " + soma);
		sc.close();
	}

}
