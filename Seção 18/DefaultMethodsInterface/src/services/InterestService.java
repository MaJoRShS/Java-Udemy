package services;

import java.security.InvalidParameterException;

public interface InterestService {

	/*
	 * Aqui ele jogou o método todo porque agora é possivel herdar métodos de
	 * interfaces, o que permite reaproveitamento
	 */
	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
