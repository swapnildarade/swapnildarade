package Demo;

import java.util.Scanner;

public class Intrest1 {

	public static void main(String[] args) {
		float p,r,n,intrest;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Principal amount");
		p=sc.nextFloat();
		System.out.println("Enter the Rate of intrest");
		r=sc.nextFloat();
		System.out.println("Enter the No of years");
		n=sc.nextFloat();
		
		intrest=(p*r*n)/100;
		System.out.println("Intrest rate is"+intrest);
		
	}

}
