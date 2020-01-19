package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aln = new Aluno();
		System.out.println("Digite seu nome: ");
		aln.name = sc.nextLine();

		System.out.println("Digite as três notas: ");
		aln.n1 = sc.nextDouble();
		aln.n2 = sc.nextDouble();
		aln.n3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", aln.finalGrade());
		if (aln.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aln.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
