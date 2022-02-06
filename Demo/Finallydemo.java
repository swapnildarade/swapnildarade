package Demo;

public class Finallydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		
		try {
				c=a/b;
				System.out.println("answer is"+c);
			}
		catch(Exception e)
			{
			System.out.println("error is "+e);
			}
		finally
		{
			System.out.println("this is final ");
		}
	}

}
