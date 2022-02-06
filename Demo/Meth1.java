package Demo;

public class Meth1 {

	

	public static void name()
	{
		System.out.println("this is method1");
	}
	
	public static void name2(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("this is method 2  "+c);
	}
	
	public  String name3(String str1, String str2)
	{
		return str1+str2;
		
	}
	public static void name3()
	{
		System.out.println("hellow ");
		
	}
	
	public static void main(String[] args) {
	
		Meth1 obj =new Meth1();
		obj.name();
		obj.name2(5,6);
		
		String s1=obj.name3("swapnil","Darade");
		System.out.println("my name is"+s1);
		
		
		obj.name3();
		
	}

}
