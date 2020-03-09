package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		/*
		 * Aqui basicamente ele está criando um objeto do tipo BusinessAccount mais e
		 * atribuindo ele em um objeto do tipo account. isso é possivel porque as
		 * BusinessAccount são Account também, mais um tipo especializado.
		 */
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		/*
		 * Aqui o bicho pega, porque eu tenho um obejto do tipo Account e to querendo
		 * converter ele para um objeto do tipo BusinessAccount ou seja eu tenho uma
		 * clase pai e to querendo converter ele em filha,
		 * 
		 * O compilador vai dar um mensagem de erro, porque ele fala que esse tipo de
		 * operação não é necessarimente correta, ai eu forço o CASTING passando na
		 * frente do nome do objeto o tipo dele.
		 */
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		/*
		 * Aqui é o mesmo principio mais com algumas diferenças, como eu fiz alguns
		 * UPCASTINGS la em cima pode ser que os objetos do tipo ACCOUNT não sejam
		 * exatamente do tipo que eu quero converter, por exemplo o savingsAccount não é
		 * filho da BusinessAccount mais sim irmão, então eu não posso converter um pelo
		 * outro, ai ele ta fazendo verificações de tipos usando o "instanceof" essa
		 * palavra me garante que meu objeto é uma instancia de uma determinada classe.
		 * 
		 * 
		 * 
		 * Fazendo isso eu consigo utilizar todos os atributos e metodos da classe pai.
		 */
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
