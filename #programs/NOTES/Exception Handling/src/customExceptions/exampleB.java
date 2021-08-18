package customExceptions;

import java.util.Scanner;

import getMessageMethod.ageInvalidException;

public class exampleB {
	
  public static void main(String[] args) {
	  
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter ur age : ");
	  int age=scan.nextInt();
	  
	  ageInvalidException ai=new ageInvalidException();
	  
	 if(age<23)
	 System.out.println("wait until 23");
	 else 
		try {
			 throw ai;	
		}
	    catch (ageInvalidException e) {
		 	System.out.println(e.getMessage()); //Overridden in Ecxeption cls
		  }
	    finally {
		scan.close();
	      }
	 }
	
 }

