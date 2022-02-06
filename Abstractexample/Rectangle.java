package Abstractexample;

public class Circle extends Shape{

	double r;
	
	 public Circle(double r) {
	        this.r = r;
	    }
	@Override
	public double area() {
	       
        return  3.142*r*r;
    }

}
