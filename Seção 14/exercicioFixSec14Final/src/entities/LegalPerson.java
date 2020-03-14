package entities;

public class LegalPerson extends Person {

	private int numberOfEmployee;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, int numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double calculateTax() {
		if (getNumberOfEmployee() <= 10) {
			return (super.getAnnualIncome() * 0.16);
		} else {	
			return (super.getAnnualIncome() * 0.14);
		}
	}

}
