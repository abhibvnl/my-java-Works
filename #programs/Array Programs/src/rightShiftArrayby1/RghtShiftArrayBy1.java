//without using new Array
package rightShiftArrayby1;

import java.util.Arrays;

public class RghtShiftArrayBy1 {
   public static void main(String[] args) {
	
	   int a[]= {1,2,3,4,5};
	   
		 
		 int temp=a[a.length-1];
		 
		 for(int i=a.length-1;i>0;i--) 
			 a[i]=a[i-1];
		 
		     a[0]=temp;
		     System.out.println(Arrays.toString(a));
		
		
}
}
