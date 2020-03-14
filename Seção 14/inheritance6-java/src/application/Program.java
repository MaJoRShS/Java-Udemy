package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		/*
		 * Mesmo a classe account sendo abstrata eu consigo criar uma lista com o tipo
		 * account, OBS. tipos de listas tem que ter uma classe para ser referenciado,
		 * exemplo eu só consigo criar uma lista de Account porque eu tenho a classe
		 * Account
		 */
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		/*
		 * Aqui ele mostra que eu consigo fazer operações em todas as classes que
		 * possuem um tipo generico, por exemplo esse "getBalance()" é da classe
		 * abstrata Account, assim como o "deposit()", é possivel fazer tudo que eu
		 * preciso em todas as contas porque eu utilizo os metodos e atributos da super
		 * classe abstrata Account.
		 */
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
