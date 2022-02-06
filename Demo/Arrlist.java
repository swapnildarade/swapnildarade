package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {

	public static void List1()
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.add(2, 5);
		System.out.println(list);
		
		
		
		Iterator itr=list.iterator();  
		while(itr.hasNext())
			{  
			System.out.println(itr.next());  
			}  
	
	}
	
	
	public static void main(String[] args) {
		Arrlist obj = new Arrlist();
		obj.List1();
	
		

	}

}
