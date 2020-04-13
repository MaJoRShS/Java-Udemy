package services;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	/*
	 * Esse cara ta aqui ainda porque é de responsabilidade dessa classe saber qual
	 * é o InterestRate dessa classe
	 */
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
