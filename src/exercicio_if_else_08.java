import java.util.Locale;
import java.util.Scanner;

public class exercicio_if_else_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Aqui eu copiei porque não intendi direito a logica utilizada para fazer a soma nem  divisão dos valores.
		System.out.println("Digite o valor do salario R$ : ");
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		//Até entendi mais acho que a qui a regra não é da melhores, ou o exemplo não é o mais didatico, porque foge um pouco do mundo real.

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
