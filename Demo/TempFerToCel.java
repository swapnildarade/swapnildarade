package Demo;

import java.util.Scanner;

public class TempFerToCel {


	
	public static float convert()
	{
		float f,C;
		System.out.println("Enter Temp in feranite");
		Scanner sc=new Scanner(System.in);
		f=sc.nextFloat();	
		
		return C=((f-32)*5)/9;
		
		
	}
	public static void main(String[] args) {
		
		TempFerToCel obj=new TempFerToCel();
		System.out.println("Temperature is  "+obj.convert());
	

	}

}
