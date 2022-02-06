package Demo;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		char input;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		input=sc.next().charAt(0);
		
		if(input=='a'|| input=='e' || input=='i' || input=='o' || input=='u')
		{
			System.out.println("Character is vowel");
			
		}
		else
		{
			System.out.println("Character is not vowel");
		}

	}

}
