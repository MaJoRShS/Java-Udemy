package entities;

import entities.enums.Color;

/*
 * Aqui quando ele deu um extends em "Shape" automaticamente o eclipse já identificou 
 * que tinha um método abstrato e já manda ele polimorfar(sobrescrever) esse método, 
 * ele cria um método generico retornando 0, ai você muda para o que você precisar.
 */
public class Rectangle extends Shape {

	private Double width;
	private Double height;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
