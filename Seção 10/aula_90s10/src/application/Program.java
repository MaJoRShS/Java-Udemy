package application;

public class Program {

	public static void main(String[] args) {

//		int x = 20;
//
//		Object obj = x;
//
//		System.out.println(obj);
//
//		//Aqui sou pbrigado a usar o casting de variavel.
//		int y = (int) obj;
//
//		System.out.println(y);
		
		
		
		int x = 20;

		Integer obj = x;

		System.out.println(obj);

		//Aqui não precisa porque eu já usei a wrapper class do mesmo tipo do valor que está na minha variavel.
		int y = obj;

		System.out.println(y);


	}

}
