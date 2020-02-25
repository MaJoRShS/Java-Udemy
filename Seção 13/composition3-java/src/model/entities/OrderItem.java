package model.entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	//Aqui ele ta passando o objeto produto de parametro mais uma vez
	private Product product;

	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}
	
	
	/*
	 * Aqui ele já faz uso de todas os getters e setters que ele construiu, ele pega o nome do produto pela "product.getName()" 
	 * formata o price, mais não tinha usado o getPrice não sei porque,(sei sim , porque o price e o quantity são dessa classe e não da product.
	 * ai já trás o subtotal formatado também
	 */
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
