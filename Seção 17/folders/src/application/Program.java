package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		/*
		 * o Files serve tanto para arquivos como diretórios, aqui ele ta validando se
		 * dentro do diretório informado existem outros diretórios, caso exista ele vai
		 * exibilos no for.
		 */
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// Aqui ele ta pegando só os aquivos dentro do diretório informado.
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}

		/*
		 * Para criar um novo diretório é o padrão "mkdir", e nesse caso ele devolve um
		 * boolean com true ou false para caso conseguir criar o diretório ou não
		 */
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
	}
}