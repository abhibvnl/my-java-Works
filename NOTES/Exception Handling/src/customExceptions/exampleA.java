//rules to create CustomExceptions
//1) create class with a exception Name 
//2) and make that class Checked(Exception) or Unchecked(RuntimeException) by inheriting 
//3) creat obj of exceptionClass and invoke in try
//4) handle it
package customExceptions;

import java.util.Scanner;

public class exampleA  {

	public static void main(String[] args) {
		System.out.println("start");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter Password: ");
		int pswd=scan.nextInt();
		
	
		
	    	if(pswd==1234)
			System.out.println("login SuccessFull");
	    	else {
	        InvalidPasswordException ip=new InvalidPasswordException();//rule 3	
	        throw ip;	
	    	}
	    	
	    	
	    	System.out.println("end");
			
	}
}
