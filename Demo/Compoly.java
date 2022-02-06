package Demo;

public class Compoly {

	   int add(int a, int b)
	   {
		return a+b;
	   }
	  
	   int add(int a,int b,int c)
		{
			return a+b+c;
		}
	  
	   float add(float c,float d)
		{
			return c+d;
		}
	  
	 
	public static void main(String[] args) {
		
		Compoly obj=new Compoly();
		
		
		System.out.println("addition is "+obj.add(3, 4));
			
		System.out.println("addition is "+obj.add(5.5f,6.2f));
	}

	
	

}
