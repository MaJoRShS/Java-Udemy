package application;
/*
 * Preciso muito estudar essa porra, igual eu fiz com o PHP ficar bolado estudando até entrar na cabeça.
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Aqui eu inicio a matriz é simples assim, instancia com o tipo e como é um
		 * bidimensional coloca duas chaves se fosse tridimensional colocaria 3 chaves
		 */
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		/*
		 * isso aqui ele ta usando para poder colocar os valores nas posições corretas,
		 * ou seja ele vai pegar o primeiro for e percorer o array de fora e o segundo
		 * for percore o array de dentro e ai grava o que foi digitado na posição.
		 */
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		/*
		 * aqui é para printar os valores da média, e ele usou um truque, como sempre a
		 * diagonal vai ser o mesmo valor da linha e da coluna ele passa sempre o 'i'
		 * que assim ele garante que vai ser o mesmo valor da linha para a coluna.
		 */
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		/*
		 * e aqui como ele precisa percorrer toda a matriz atrás de valores negativos
		 * ele criar um contador para ser incrementado sempre que ele encontrar um valor
		 * negativo isso percorrendo todos os campos dos arrays internos..
		 * 
		 * 
		 * -----------------------------------------------------------------------------
		 * -----------------------------
		 * 
		 * Aqui tem uma dica, assim como tem o .length no array, como aqui é um array
		 * que tem dentro dele outros arrays também é possivel usar o .length, porém
		 * para o array de fora usa normal como é em um array simples, já no array
		 * interno se usa o nome do array externo com a posição e o .length que ai ele
		 * vai pegar o valor do campo dentro do array que foi alocado naquela posição
		 * dentro do outro array
		 */
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		sc.close();
	}
}