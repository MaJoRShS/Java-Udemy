import java.util.Scanner;

public class aulo_59 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Forma de fazer mais sem usar funções
		// if(a > b && a > c) {
		// System.out.println("Higher = " + a );
		// }
		// else if(b > c) {
		// System.out.println("Higher = " + b );
		// }else {
		// System.out.println("Higher = " + c );
		// }

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	
	/*	
	 * 	Aqui eu criei duas funções
	 * 
	 *  Essa primeira serve para poder fazer o calculo de qual numero é o maior
	 *  
	 *  E a ultima serve apenas para retornar o valor para a tela.
	 */
	
	public static int max(int x, int y, int z) {		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	
	

}
