// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
package prime;

public class prime1to100 {

	 public static void main(String[] args) {
			 
		  for (int no=2;no<=100;no++) {
			  boolean prime=true;
			  
			  for(int i=2;i<no-1;i++) 
				  if(no%i==0)
					 prime=false;
				 
			      if(prime)     // if(prime==true)--->shortHand--->if(prime)
				  System.out.println(no);
			 
		     }
		 
			 
	}
}

