package Demo;

public class Outer {
	
		int a=10;
		String b="Swapnil";
		
		class Inner{
			
			public void meth()
			{
				System.out.println("Number is "+a);
				System.out.println("Name is is "+b);
			}
			
			
		}
	

	public static void main(String[] args) {
		Outer ob=new Outer();
		Outer.Inner in=ob.new Inner();
		in.meth();
		
	}

}
