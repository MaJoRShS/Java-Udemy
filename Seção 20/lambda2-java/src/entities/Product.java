package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/*
	 * Aqui ele mostrou que da para usar desse jeito mais isso se chama :Reference
	 * method com método estático, aqui ele deixa assim e la classe principal ele
	 * chama o nome do programa junto com o nome do método
	 */
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	
	/*
	 * Aqui é a mesma coisa mais ele trabalha com o produto que está trabalanhando com o atributo da instancia.
	 */
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
