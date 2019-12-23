import java.util.Scanner;

public class aula_33_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		//Estrutua condicional Simples.
			
		
//		int x = 5;	
//		
//		System.out.println("Bom dia");
//	
//		if (x > 10) {
//			System.out.println("Boa Tarde");
//		
//		}
//		
//		System.out.println("Boa noite");
	
		
				
		//Estrutura condicional composta

//		System.out.println("Quantas horas: ");
//		int hora = sc.nextInt();
//		
//		
//		if(hora <= 12) {
//			System.out.println("Bom Dia");
//		}else {
//			System.out.println("Boa Tarde");
//		}

		
		
		//Estrutura condicional Encadeadas
		System.out.println("Quantas horas: ");
		int hora = sc.nextInt();
		
		
		if(hora <= 12) {
			System.out.println("Bom Dia");
		}else {
			if(hora <= 18) {
			System.out.println("Boa Tarde");
			}else {
				System.out.println("Boa noite");
			}
		}
				
		sc.close();
	}

}
