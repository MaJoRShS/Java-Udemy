package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder stbd = new StringBuilder();
		stbd.append(getName()).append(" 	(used) $ ").append(String.format("%.2f", getPrice()))
				.append(" (Manufacture date: ")
				/*
				 * Aqui a unica coisa que eu tinha feito de errado é que eu tava usando o
				 * "getManufactureDate" ao invés de usar o "manufactureDate" direto e por isso
				 * tava dando erro, mais de resto foi de boas, eu segui o esquema da aula
				 * passada mais consegui.
				 * 
				 * Ah e ele não usa o StringBuilder.
				 */
				.append(sdf.format(manufactureDate)).append(")");
		return stbd.toString();
	}

}
