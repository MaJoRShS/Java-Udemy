package entities;

public class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct() {
		super();
	}
	
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomerFee() {
		return customsFee;
	}


	public void setCustomerFee(Double customerFee) {
		this.customsFee = customerFee;
	}
	
	 @Override
		public String priceTag() {
		 StringBuilder stbd = new StringBuilder();
		 stbd.append(getName())
		 	 .append(" $ ")
		 	 .append(String.format("%.2f",totalPrice()))
		 	 .append("(Customs fee: $ ")
		 	 .append(String.format("%.2f",getCustomerFee()))
		 	 .append(")");
		return stbd.toString();
	}
	 
	 public Double totalPrice() {
		 return super.price += getCustomerFee();
	 }
	
}
