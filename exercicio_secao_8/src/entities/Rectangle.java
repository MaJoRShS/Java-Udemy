package entities;

public class Rectangle {
	
	
	public double width;
	public double heigth;
	
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return 2 *(width + heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + heigth * heigth);
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f%n", area())
			   + "PERIMETER = " + String.format("%.2f%n", perimeter())
			   + "DIAGONAL = " + String.format("%.2f%n", diagonal());
	}
	

}
