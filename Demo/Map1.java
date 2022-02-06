package Demo;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	    public static void main(String args[]){

	        Map<Integer, String> m1 = new HashMap<>();

	     

	        m1.put(1, "one ");
	        m1.put(2, "two ");
	        m1.put(3, "three ");
	        
	      
	        for (Map.Entry<Integer, String> me : m1.entrySet()) {
	        
	        System.out.print(me.getKey()+" ");
	        System.out.println(me.getValue());
	        
	       

	        }

	    }

	}