package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		//Aqui mostra o caminho completo do arquivo
		System.out.println("getPath: " + path.getPath());
		
		//Aqui mostra o caminho até o diretório onde você está
		System.out.println("getParent: " + path.getParent());
		
		//Aqui mostra só o nome do arquivo.
		System.out.println("getName: " + path.getName());
		sc.close();
	}
}