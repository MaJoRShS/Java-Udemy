import java.util.Scanner;

public class exercicio_while_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite os valores de X e Y: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//Aqui eu precisei olhar o dele, porque a logica tava errada, ele só entra na validação se os valores forem diferentes de 0
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
