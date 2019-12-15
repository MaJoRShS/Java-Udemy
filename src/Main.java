import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double y = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%.4f%n",y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",y);
		System.out.println("Texto qualquer " + y + " Final do texto qualquer");
		System.out.printf("Resultado = %.2f  Metros%n", y);
		System.out.printf("%s tem %d anos e ganha R$ : %.2f reais %n", nome, idade, renda);
	}

}
