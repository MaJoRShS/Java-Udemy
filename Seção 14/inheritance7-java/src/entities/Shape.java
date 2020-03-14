package entities;

import entities.enums.Color;

/*
 * Essa é a classe que se tornou abstrata porque tem um método abstrato, pura e simplesmente.
 */
public abstract class Shape {

	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/*
	 * Método abstrato é escrito dessa forma, não tem nada além do abstratct , o
	 * tipo do método, e o nome dele.
	 */
	public abstract double area();
}
