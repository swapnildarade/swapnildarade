package Datastructure;

public class Statisticsmain {

	
		public static void main(String[] args) {
			
			KSmall ob = new KSmall(); 
			
	        int arr[] = {12, 3, 57, 4, 19, 26}; 
	        
	        int left=0;//first index
	        
	        int n = arr.length;
	        
	        int right= n-1; //last index
	        int k = 3; 
	        
	        System.out.println("K'th smallest element is "+ ob.KSmall(arr, left, right, k)); 
	    }
	}
