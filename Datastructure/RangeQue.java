package Datastructure;

public class RangeQue {
	
		static int k = 12;
		static int N = 10000;
		
		static long table[][] = new long[N][k + 1];

		static void buildSparseTable(int arr[], int n) {
			
			for (int i = 0; i < n; i++)
				table[i][0] = arr[i];
			for (int j = 1; j <= k; j++)
				for (int i = 0; i <= n - (1 << j); i++)
					table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
		}

		static long query(int L, int R) {
			long answer = 0;
			for (int j = k; j >= 0; j--) {
				if (L + (1 << j) - 1 <= R) {
					answer = answer + table[L][j];
					L += 1 << j;
				}
			}
			return answer;
		}
		 public static void main(String args[]) 
		    { 
		        int arr[] = { 4,8,6,5,2,3 }; 
		        int n = arr.length;

		        RangeQue.buildSparseTable(arr, n); 
		        
		        System.out.println(RangeQue.query(0, 4)); 
		        System.out.println(RangeQue.query(3, 3)); 
		        System.out.println(RangeQue.query(1, 5)); 
		    } 
	}

