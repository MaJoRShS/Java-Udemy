package entities;

public class Product {

	public String name;
	public Double price;
	public int quantity;

	/* Esse aqui é o construtor padrão da classe e como eu quero deixar que o DEV
	* escolha qual instancia ele vai usar eu deixo a default disponivel também.
	*/
	public Product() {
	}

	/* alterando o construtor para exemplo da seção 09 antes não tinha esse bloco de
	* Código.
	*/
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * Esse aqui também é um metodo construtor, só como eu tenho mais de um e com
	 * opções diferentes eu estou fazendo uma sobrecarga de método, que faz com que
	 * eu tenha varias opções de instancia da mesma classe.
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
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
