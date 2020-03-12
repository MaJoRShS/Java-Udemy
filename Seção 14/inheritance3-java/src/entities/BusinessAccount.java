package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	/*
	 * Aqui ele está utilizando o conceito de Sobreposição, assim ele consegue
	 * utilizar um metodo com o mesmo nome do metódo da classe pai, na classe filha.
	 * ainda tem a parada que ele está utilizando a palavra "super." aqui ele está
	 * utilizando mesmo o metodo da classe pai e ainda mudando o comportamento do
	 * metodo.
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
