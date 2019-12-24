import java.util.Locale;


public class aula_38 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Exemplo com if else
//		double preco = 34.5;
//		double desconto;
//		if (preco < 20.0) {
//		desconto = preco * 0.1;
//		}
//		else {
//		desconto = preco * 0.05;
//		}
//		System.out.println("Valor do Desconto: "+ desconto);
	
	
		//Exemplo com expressão ternaria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println("Valor do Desconto: "+ desconto);
	
	}

}
