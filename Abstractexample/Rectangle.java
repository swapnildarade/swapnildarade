package Abstractexample;

public class Rectangle  extends Shape {

	
	      double width, length; 

	      
	      public Rectangle(double width, double length) {
	          this.width = width;
	          this.length = length;
	      }

	    @Override
	    public double area() {
	       
	        return width * length;
	    }

	   

	}
