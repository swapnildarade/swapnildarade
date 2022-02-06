package Demo;

public class StringOperations {

	public static void meth1()
	{
		String s="this is comment";
		String s2="Method";
		
		System.out.println("string length is: "+s.length());
		System.out.println("string trim: "+s.trim());
		System.out.println(s.toUpperCase());   
		System.out.println(s.toLowerCase()); 
		System.out.println(s.indexOf("comment"));
		System.out.println(s.concat(" "+s2));
		
	 }
	public static void main(String[] args) {
		
		StringOperations obj =new StringOperations();
		obj.meth1();
	

	}

}
