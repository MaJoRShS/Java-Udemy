package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui ele está falando que é polimorfismo porque eu tenho duas instancias do
		 * tipo Account porém uma é do tipo Account e outra é do tipo SavingsAccount
		 * mais mesmo assim da para falar que é polimorfismo porque eu to usando o mesmo
		 * método nas duas instancias e cada uma tem um comportamento diferente.
		 */
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}
