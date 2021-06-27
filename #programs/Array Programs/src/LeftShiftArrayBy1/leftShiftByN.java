//without using new Array
package LeftShiftArrayBy1;

import java.util.Arrays;

public class leftShiftByN {
   public static void main(String[] args) {
	
	   int a[]= {1,2,3,4,5};
	   
		 int times=2;    //shift array lest by 2 times
		for(int i=0;i<times;i++)
			 for(int j=0;j<a.length-1;j++) {
				int temp=a[j+1];	
				a[j+1]=a[j];
				a[j]=temp;
				}
		
		 System.out.println(Arrays.toString(a));
		 
		
		
}
}
