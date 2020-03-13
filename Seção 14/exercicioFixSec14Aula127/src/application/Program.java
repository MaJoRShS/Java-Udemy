package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int x = sc.nextInt();
		
		/*
		 * Para mim a uncia filhadaputagem aqui é já iniciar o contador em 1, que ai fica certo na conta.
		 */
		for (int i = 1; i <= x; i++) {
			System.out.println("Product #" + i + " data: " ); 
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			
			if(ch == 'c') {
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			list.add(new Product(name, price));
			}
			if(ch == 'i'){
				System.out.print("Name:");
				String name = sc.next();
				System.out.print("Price:");
				Double price = sc.nextDouble();
				System.out.print("Customs fee:");
				Double customerFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customerFee));
			}
			if(ch == 'u'){
				System.out.print("Name:");
				String name = sc.next();
				System.out.print("Price:");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate  = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			
		}
			
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product prd : list) {
			System.out.println(prd.priceTag());	
		}
		
		
		
		sc.close();
	}

}
