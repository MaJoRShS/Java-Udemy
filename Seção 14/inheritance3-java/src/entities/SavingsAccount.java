package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	/*
	 * Aqui é só uma Sobreposição de metodo simples quando reescrevo um metodo de
	 * uma classe pai em uma classe filha e mudo apenas o comportamento dele, mais
	 * ainda assim deixando claro que é uma sobreposição utilizando a anotação
	 * "@Override"
	 */
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
