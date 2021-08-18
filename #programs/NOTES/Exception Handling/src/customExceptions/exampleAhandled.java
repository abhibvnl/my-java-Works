package customExceptions;

import java.util.Scanner;

public class exampleAhandled  {

	public static void main(String[] args) {
		System.out.println("start"); 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter Password: ");
		int pswd=scan.nextInt();
		
	    	if(pswd==1234)
			System.out.println("login SuccessFull");
	    	else {
	    		try {  //4
	    			InvalidPasswordException ip=new InvalidPasswordException();
	    	    	throw ip;		
				} catch (InvalidPasswordException e) {
					System.out.println(e.getMessage());
				}
	    	
	    	}
			
	    	System.out.println("end");
	}
}
