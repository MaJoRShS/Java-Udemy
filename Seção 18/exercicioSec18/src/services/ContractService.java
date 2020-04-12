package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	/*
	 * Aqui ele pega o contrato e a quantidade de parcelas,e ai faz todo o
	 * processamento
	 */
	public void processContract(Contract contract, int months) {

		/*
		 * aqui ele pega o valor do contrato e divide pela quantidade de meses que
		 * ousuario colocou
		 */
		double basicQuota = contract.getTotalValue() / months;

		/*
		 * aqui ele vai passar fazer os calculos certinho para cada valor e depois ele
		 * vai adiciona no contrato as datas e o valor já calculado para o método
		 */
		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			contract.addInstallment(new Installment(date, fullQuota));
		}
	}

	/*
	 * Aqui ele usa o calendar para setar os meses e poder pegar as datas corretas
	 * apartir de uma instancia de contrato
	 */
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
