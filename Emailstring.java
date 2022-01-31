package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Emailstring {

	public static void main(String[] args) {
		String a1[]={"abc@gmail.com","def@gmail.com","ghi@gmail.com","jkl@gmail.com","mno@gmail.com","xyz@gmail.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Email ID");
		String a2=sc.next();
		
		
		if(Arrays.asList(a1).contains(a2))
		{
			System.out.println(" Email ID Present");
		}
		else
		{
			System.out.println("Email ID not present");
		}
	}

}
