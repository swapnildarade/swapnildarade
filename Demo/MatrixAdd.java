package Demo;

import java.util.Scanner;

public class MatrixAdd 
{
	public static void mat1()
	{
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int res[][] = new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		for (int row=0; row<3; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.println("enter the number of 1st matrix");
				arr1[row][col]=sc.nextInt();
			}
		}
		
		for (int row=0; row<3; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.println("enter the number of 2nd matrix");
				arr2[row][col]=sc.nextInt();
			}
		}
		
		
		
		
		 for( int row = 0; row<3; row++)
	      {
	         for(int col = 0; col<3; col++)
	         {
	            res[row][col] = arr1[row][col] + arr2[row][col];
	         }
	      }
		
		
	
	
	
	
		System.out.println("Print matrix");
		
		for (int row=0; row<3; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(res[row][col]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) 
	{
		MatrixAdd ob=new MatrixAdd();
		ob.mat1();
		

	}

}
