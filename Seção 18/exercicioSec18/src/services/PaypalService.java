package services;

public class PaypalService implements OnlinePaymentService {

	/*
	 * Aqui ele já criou os caras como atributos finais para que eles não podessem
	 * ser alterados, e ainda poder reutilizar em todos os lugares
	 */
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;

	/*
	 * Aqui faz o calculo de um mês com o valor que foi passado
	 */
	@Override
	public double paymentFee(double amount) {
		return amount * FEE_PERCENTAGE;
	}

	/*
	 * Aqui ele pega o valor já calculado ali em cima e soma mais 2% aqui por mês.
	 */
	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}
}
