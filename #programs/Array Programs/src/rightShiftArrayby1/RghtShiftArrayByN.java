//without using new Array
package rightShiftArrayby1;

import java.util.Arrays;

public class RghtShiftArrayByN {
   public static void main(String[] args) {
	
	   
	   int a[]= {1,2,3,4,5};
	   int N=2;  //shift 2 times ,,,,,,,,,,,,,,
	   	
		  for(int i=0;i<N;i++) {
			  int temp=a[a.length-1];
			  
			   for(int j=a.length-1;j>0;j--) 
				 a[j]=a[j-1];
			   
			     a[0]=temp;	
		  }
			
			     System.out.println(Arrays.toString(a));
			
}
}
