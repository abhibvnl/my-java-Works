//program to rev the array
package RevArray;

import java.util.Arrays;



public class RevArray2 {
	
   public static void main(String[] args) {
	   
	 int a[]= {1,2,3,4,5};
	
	 
	 for(int i=0;i<(a.length-1)/2;)
		 for(int j=a.length-1 ;j>(a.length-1)/2;j--) {
			int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				
		 }
	 System.out.println(Arrays.toString(a));

		
	 
		 
}
}
