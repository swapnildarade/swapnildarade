package Demo;

import java.util.Scanner;

public class Rectarea {

	public static void main(String[] args) {
		float s,area,perimeter;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the side of square");
		s=sc.nextFloat();
		
		area=(s*s);
		System.out.println("Area of square is  "+area);
		
		perimeter=(s*4);
		System.out.println("Perimeter of square is  "+perimeter);
		
		
		

	}

}
