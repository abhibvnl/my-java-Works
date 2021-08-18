//input :
//1 2 3 4 5 or any

//output:
//minSum =1+2+3+4=10
//maxSum=2+3+4+5=14;
package questionSet1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11{
	
	public static void minMaxSum(ArrayList<Integer> arr) {
		
		
		    long cmax = 0;
			long cmin = 0;
			int max = Integer.MAX_VALUE;  //2147483647
			int min = Integer.MIN_VALUE;   //-2147483648
	for(int i : arr){

	    if(i > min){

	        min = i;
	    }
	    if(i < max){

	        max = i;
	    }

	}
	for(int j : arr){
	    cmax = cmax + j ;
	    cmin = cmin + j ;
	}
	
	System.out.println((cmax-min) + " " + (cmin-max));
	}

		
		 
	
	
	public static void main(String[] args) {
		//7 69 2 221 8974 :> 299 , 9271
		//1 2 3 4 5       :> 10 14
		
		ArrayList<Integer> arr =new ArrayList<>();
		 arr.add(7);
		 arr.add(69);
		 arr.add(2);
		 arr.add(221);
		 arr.add(8974);
		 minMaxSum(arr);	
	}

}

//Mysol
/*
 long minMaxStore[]=new long[arr.size()];
		 for(int i=0; i<arr.size() ; i++ ) {
			 for(int j=0; j<arr.size() ; j++ ) {
				 if(arr.get(i)!=arr.get(j))
					 minMaxStore[i]+=arr.get(j); 		 
			 }
		 }
		 
		// System.out.println(Arrays.toString(arr2));
		 int minSum=minMaxStore[0];
		int maxSum=0;
		 for(int i=0; i<minMaxStore.length ;i++) {
			 if(minMaxStore[i]<minSum)
				 minSum=minMaxStore[i];
			 else
				 maxSum=minMaxStore[i];	 
		 }
		System.out.println(minSum+" "+maxSum);
		
 */

//hackerRank sol
/*
        long cmax = 0;
		long cmin = 0;
		int max = Integer.MAX_VALUE;  //2147483647
		int min = Integer.MIN_VALUE;   //-2147483648
for(int i : arr){

    if(i > min){

        min = i;
    }
    if(i < max){

        max = i;
    }

}
for(int j : arr){
    cmax = cmax + j ;
    cmin = cmin + j ;
}
System.out.println((cmax-min) + " " + (cmin-max)); }

}
*/
 