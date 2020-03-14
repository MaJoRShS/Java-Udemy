package entities;

import entities.enums.Color;

/*
 * Mesma coisa da outra classe fui obrigado a importar e sobrescrever um método abstrato da super classe abstrata,
 *  porque pelo que eu intendi você é obrigado e importar o método abstrato quando tiver.
 */
public class Circle extends Shape {

	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
