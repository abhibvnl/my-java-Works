package prime;

public class checkPrime {
  public static void main(String[] args) {
	
	  int no=9;
	  boolean prime=true;
			  ;
	  for(int i=2;i<no-1;i++)
		  if(no%i==0)
			 prime=false;
	  
	 System.out.println(prime ? "prime":"not prime");
		 
}
}
