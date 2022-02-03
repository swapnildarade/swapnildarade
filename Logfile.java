package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Logfile {
	double num1;
    double num2;
    double ans;
    char op;
	public  void calculator() throws IOException
	{
		
	      Scanner reader = new Scanner(System.in);
	      System.out.println("enter 1st no");
	      num1 = reader.nextDouble();
	      
	      System.out.println("enter operation");
	      op = reader.next().charAt(0);
	      
	      System.out.println("enter 2nd no");
	      num2 = reader.nextDouble();
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	     
	      System.out.println( + ans);
	
		File f=new File("D:\\logdata.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is already Exist");
		}
		
		FileWriter w=new FileWriter(f);
		w.append("First Number = "+num1+"  Second Number is= "+num2+"  Thired Number is= "+ans);
		
	
		w.close();
		
		FileInputStream stream= new FileInputStream("D:\\Logdata.txt");
		int data;
		while((data=stream.read())!=-1)
		{
			System.out.print((char)data);
		}
		System.out.println("");
	}

	public static void main(String[] args) throws IOException
	{
		Logfile f=new Logfile();
		
		f.calculator();

	}

}
