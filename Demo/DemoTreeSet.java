package Demo;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void myfun()
	{
		TreeSet<Integer>  T1= new TreeSet<Integer>();
		T1.add(1);
		T1.add(2);
		T1.add(3);
		T1.add(4);
		T1.add(5);
		
		System.out.println("Names are "+T1);
		
		 Iterator n = T1.iterator();
		 
		 while (n.hasNext())
		 {
			 System.out.println(n.next());
		 }
	}
	public static void main(String[] args) {
		DemoTreeSet obj=new DemoTreeSet();
		obj.myfun();
		

	}

}
