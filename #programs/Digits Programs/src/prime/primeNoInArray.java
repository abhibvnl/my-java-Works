// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
package prime;

public class primeNoInArray {

	 public static void main(String[] args) {
		 
		int[] a= {2,3,4,5,6,7,8,9,10};
			 
		  for (int i=0;i<=a.length-1;i++) {
			  boolean prime=true;
			  
			  for(int j=2;j<a[i]-1;j++)
				  if(a[i]%j==0)
					  prime=false;
				 
			        if(prime)
			     	  System.out.println(a[i]);
			  
		  }
		 
			 
	}
}

