//printing 1 to 100 prime numbers
package prime;
import java.util.Scanner;

public class prime100 {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		//System.out.print("enter numb to be check : ");
		
		// int num=scan.nextInt();
   		 
		
		  
		 for( int num=0; num<=100 ;num++) {
		 int m=num/2;
		 boolean flag=false;
		 if(num==0||num==1 ) {
			System.out.println(num+ " not prime");
			continue;
		 }
		 else 
		 {
			for(int i=2; i<=m; i++) {
				if(num%i==0) {
				  System.out.println(num + " not prime");
				  flag=true; 
				  break;  //break the currespoinding for loop
				}
			}
		 }
		 
		 if(flag==false)
		 System.out.println(num+ " is prime no");
	}
	}

 
 
}
