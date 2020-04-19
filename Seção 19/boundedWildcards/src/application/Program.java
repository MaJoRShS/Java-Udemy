package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		/*
		 * Aqui é o mesmo principio eu tenho duas listas de tipos diferentes e elas são
		 * associadas a um tipo generico de lista, e funciona porque o tipo principal da
		 * lista é um tipo generico
		 */
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	/*
	 * Aqui ele criou um tipo generico de lista e para poder inserir dados nessas
	 * listas ele declarou que as listas são do tipo shape ou de qualquer classe que
	 * extenda shape
	 */
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
