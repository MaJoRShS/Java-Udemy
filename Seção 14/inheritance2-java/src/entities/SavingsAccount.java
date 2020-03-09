package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	// Aqui padrão, ele criou um construtor sem nada mais com o super() pro caso de
	// existir configurações no construtor.
	public SavingsAccount() {
		super();
	}

	/*
	 * Aqui padrão também criando uma mano com a herança, os três primeiros item são
	 * da classe pai e ele indica isso no super().
	 */
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
}
