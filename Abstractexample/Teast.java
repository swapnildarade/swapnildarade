package Abstractexample;

public class Teast {

	
	public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape Rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length+ "\nResulting area: " + Rectangle.area());

        // Circle test
        double r = 5;
        Shape Circle = new Circle(r);
        System.out.println("Circle radius: " + r+ "\nResulting Area: " + Circle.area());
	}
}
