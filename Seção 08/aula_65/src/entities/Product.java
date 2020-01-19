package entities;

public class Product {

	public String name;
	public Double price;
	public int quantity;

	// alterando o construtor para exemplo da seção 09 antes não tinha esse bloco de
	// Código.

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
