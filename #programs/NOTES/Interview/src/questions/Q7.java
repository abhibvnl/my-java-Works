//sum of prime number in sequence..
package questions;

import java.util.Scanner;

public class Q7 {
	
 public static void main(String[] args) {
	 System.out.print("Enter price : ");
	 Scanner scan=new Scanner(System.in);
	 
	 String price=scan.next();
	 int eachDigits[]=new int[price.length()];
	 
	 for(int i=0;i<price.length();i++)
       eachDigits[i]=Character.getNumericValue(price.charAt(i));
	 
	  int primeSum=0;
	 
	 //prime Logic
	 
	 for (int i=0;i<=eachDigits.length-1;i++) {
		  boolean prime=true;
		  
		  for(int j=2;j<eachDigits[i]-1;j++)
			  if(eachDigits[i]%j==0)
				  prime=false;
			 
		        if(prime)
		     	primeSum+=eachDigits[i];
		  
	  }
	
	 System.out.println("output : "+ primeSum);
   
}
}
