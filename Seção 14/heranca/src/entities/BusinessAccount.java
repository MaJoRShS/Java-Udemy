package entities;

/*
 * Aqui entra a parada do extends o que indica que esse cara aqui é filho de uma outra classe e que ele recebe seus atributos e metodos
 */
public class BusinessAccount extends Account {

	private Double loanLimit;

	/*
	 * Aqui é utilizado mesmo o super(); porque eu quero todas as possiveis
	 * configurações que a classe pai possa ter
	 */
	public BusinessAccount() {
		super();
	}

	/*
	 * Aqui foi criado direto pelo eclipse, porem como eu quero que ele seja
	 * instanciado utilizando os atributos da classe pai mais os atributos daqui eu
	 * preciso declarar que no super são os caras do pai, e que o que está vindo a
	 * mais ali é o atributo daqui mesmo.
	 */
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
			/*
			 * Aqui eu só consigo chamar o atributo direto porque ele está setado como
			 * protected se não ia ter que usar o getBalance(); mesmo sendo uma classe filha
			 */
			balance += amount - 10.0;
		}
	}
}