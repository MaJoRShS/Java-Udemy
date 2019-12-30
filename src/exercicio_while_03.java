import java.util.Scanner;

public class exercicio_while_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
//Aqui a mesma coisa, só que eu não tinha declarado as variaveis fora, e ai por isso estava dando erro na hora de printar elas
//mais mesmo assim acho que eu já me acostumei com as validações com valores positivos e não com a negação por isso que to bugando.
		while (tipo != 4) {
			if (tipo == 1) {
				alcool =+ 1;
			}
			else if (tipo == 2) {
				gasolina =+ 1;
			}
			else if (tipo == 3) {
				diesel =+ 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
