package Demo;

public class Rettype {

	public int add(int a, int b)
	{
		return a+b;
	}
	public int add()
	{
		int a=5, b=4;
		return a*b;
	}

	public static void sub(int c, int d)
	{
		
		System.out.println("sub="+(c-d));
	}
	public static void div()
	{
		int c=10, d=2;
		System.out.println("div="+(c/d));
	}
	public static void main(String[] args) {
		
		Rettype obj=new Rettype();
		System.out.println("add="+obj.add(2, 4));
		System.out.println("Mul="+obj.add());
		obj.sub(8, 2);
		obj.div();
	}

}
