package services;

public interface OnlinePaymentService {
	// Essa eu tinha feito certo
	double paymentFee(double amount);

	double interest(double amount, int months);
}
