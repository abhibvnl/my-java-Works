//without using new Array
package LeftShiftArrayBy1;

import java.util.Arrays;

public class leftShiftBy1 {
   public static void main(String[] args) {
	
	   int a[]= {1,2,3,4,5};
	   
		 
		 int temp=a[a.length-1];
		 
		 for(int i=0;i<a.length-1;i++) {
			int temp2=a[i+1]	;	
			a[i+1]=a[i];
			a[i]=temp2;
			
		 }
		 System.out.println(Arrays.toString(a));
		 
		
		
}
}
