//in order override getMessage method it should Override in Exception cls nly
package getMessageMethod;

import java.util.Scanner;

public class exampleB {
	
  public static void main(String[] args) {
	  
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter ur age : ");
	  int age=scan.nextInt();
	
	 if(age<23)
	 System.out.println("wait until 23");
	 else 
		try { 
			 ageInvalidException ai=new ageInvalidException();
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

