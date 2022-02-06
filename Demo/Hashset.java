package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		System.out.println(set);
		
		 Iterator<Integer> i = set.iterator();
		
		 while (i.hasNext())
		 {
			 System.out.println(i.next());
		 }
	}

}
