package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.enitities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		try{
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		String holder = sc.next();
		
		sc.hasNextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double witdrawLimit = sc.nextDouble();
		
		
		Account acc = new Account(number, holder, balance, witdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		System.out.println("\nNew balance: " + acc.withdraw(amount));
		}
		catch(DomainException e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("The data type is incorrect. ");
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error. ");
		}
		sc.close();
	}

}
