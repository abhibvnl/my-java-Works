package prime;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.print("enter numb to be check : ");
		
		 int num=scan.nextInt();
   		 int m=num/2;
		 boolean flag=false;
		 
		 if(num==1||num==0 )
			System.out.println(num+ " not prime");
		 else 
		 {
			for(int i=2; i<=m; i++) {
				if(num%i==0) {
				  System.out.println(num + " not prime");
				  flag=true;
				  break;
				}
			}
		 }
		 
		 if(flag==false)
			 System.out.println(num+ " is prime no");
	}

 
 
}
