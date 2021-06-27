//program to rev the array
package RevArray;

import java.util.Arrays;



public class RevArray {
	
   public static void main(String[] args) {
	   
	 int a[]= {1,2,3,4,5};
	 int revArray[]= new  int[a.length];
	 
	 for(int i=0;i<a.length-1;)
		 for(int j=a.length-1 ;j>=0;j--) {
			 revArray[i]=a[j];
			 i++;			 
		 }
	  
	 System.out.println(Arrays.toString(revArray));		
	 
		 
}
}
