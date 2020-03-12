package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	/*
	 * Classe extendida por isso que mandou o "super()." para poder utilziar todas
	 * as configurações que possam existir
	 */
	public OutsourcedEmployee() {
		super();
	}

	/*
	 * Aqui eu to instanciando uma extensão por isso que precisa ser o construtor da
	 * classe pai que no caso é o Employee, e passa o argumento adicional dessa
	 * classe no construtor e o que é da classe pai no super
	 */
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	/*
	 * Aqui tem a sobreposição do método que vai servir para fazer o pagamento
	 * diferenciado para o funcionario terceirizado.
	 */
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
