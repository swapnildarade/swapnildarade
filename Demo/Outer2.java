package Demo;

public class Outer2 {
	
	public void display()
	{

	class Inner{
		
		int a=100;
		public void meth()
		{
		if(a<400){
			System.out.println("Number is "+a);
			
		}
		else {
			System.out.println("Invalid");
		}
				}
	}
	Inner i1=new Inner();
	i1.meth();
		
	
	}
	public static void main(String[] args) {
		Outer2 ob2=new Outer2();
		ob2.display();

	}

}
