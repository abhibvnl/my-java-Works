

package prime;
import java.util.Arrays;
import java.util.Scanner;

public class primeCnt100C {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
	
		 int primeCnt=0;
		 
		 for( int num=0; num<=100 ;num++) {
		 int m=num/2;
		 boolean flag=false;
		 if(num==0||num==1 ) {
			//System.out.println(num+ " not prime");
			continue;
		 }
		 else 
		 {
			for(int i=2; i<=m; i++) {
				if(num%i==0) {
				//  System.out.println(num + " not prime");
				  flag=true; 
				  break;  //break the currespoinding for loop
				}
			}
		 }
		 
		 if(flag==false) {
		 // System.out.println(num+ " is prime no");	
		  primeCnt+=num;
		 }
		}
		 System.out.println("addition of prime numbs form 1 to 100 is " +primeCnt);
		  String primes=Integer.toString(primeCnt);
		 
		  char pArray[]=new char[primes.length()];
		  int pArrayCnt=0;
		  for(int k=0;k<pArray.length;k++) {
			pArray[k]=primes.charAt(k)  ;
			pArrayCnt+=Character.getNumericValue(pArray[k]);
		  }
		 
		  System.out.println(Arrays.toString(pArray));
		  System.out.println(pArrayCnt); //cnt of 1060
		  String  s1=Integer.toString(pArrayCnt);
		  String s2="hello";
		  String s3=s2.replace("e", s1);
		  System.out.println(s3);
		
		 
		 
	}
}

