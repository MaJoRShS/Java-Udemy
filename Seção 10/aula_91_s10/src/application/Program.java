package application;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("For normal");
		System.out.println();
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(int i = 0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("ForEach");
		System.out.println();
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
