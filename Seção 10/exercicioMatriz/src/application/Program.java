package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int col = sc.nextInt();
		int row = sc.nextInt();

		int[][] mat = new int[col][row];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int search = sc.nextInt();

		/*
		 * Aqui eu estou falando de linhas e colunas o que o mano fez ele simplesmente
		 * acessou a matriz procurando em todos os lugares na matriz onde o valor
		 * digitado estava la fazendo assim se eu chego na posição do valor digitado e
		 * ai começo a fazer aquela posição - ou + o valor da posição da linha e da
		 * coluna e ai você pega todos sempre lembrando que se for 0 eu não preciso
		 * mostrar nada, então começa a validação pelo 2
		 */
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == search) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
