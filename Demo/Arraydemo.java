package Demo;

public class Arraydemo {

	public static void main(String[] args) {
		int array[]= {12,23,34,45,56,87,5};
		
		
		
		
		
		System.out.println("Element at index 4 "+array[4]);
		
		System.out.println("Length of an array "+array.length);
		
		System.out.println("access same using for loop");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ,");
		}
		
		System.out.println();
		System.out.println("access same using for each loop");
		
		
		
		int a,large = array[0],small =array[0];
		for(a=1;a<array.length;++a)
		{
		if(array[a]>large)
		large=array[a];

		if(array[a]<small)
		small=array[a];
		}

		System.out.println("The smallest element is " + small );
		System.out.println("The largest element is " + large );
	}
}
		
		

