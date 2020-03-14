package entities;

public class PhysicalPerson extends Person {

	private Double medicalExpense;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double medicalExpense) {
		super(name, annualIncome);
		this.medicalExpense = medicalExpense;
	}

	public Double getMedicalExpense() {
		return medicalExpense;
	}

	public void setMedicalExpense(Double medicalExpense) {
		this.medicalExpense = medicalExpense;
	}

	/*
	 * Aqui a unica coisa que me bugou aqui foi que eu tinha que colocar direto no
	 * retorno o valor da soma e eu fiquei querendo colocar em uma variavel o valor
	 * do calculo, além disso eu tava querendo fazer o valor do calculo do Imposto
	 * sendo que eu não precisaria tendo em vista como é o valor em porcentagem de
	 * programação fica mais easy.
	 */
	@Override
	public Double calculateTax() {
		if (super.getAnnualIncome() <= 2000.00) {
			return (super.getAnnualIncome() * 0.15) - (medicalExpense * 0.5);
		} else {
			return (super.getAnnualIncome() * 0.25) - (medicalExpense * 0.5);
		}

	}

}
