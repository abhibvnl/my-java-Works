package upperCaseLowerCaseJsp2;

import java.util.Arrays;
import java.util.Scanner;

public class upperLowerCase2 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
		System.out.print("enter msg to convert lower Case to upperCase : ");
		String msg=scan.next();
		
		int values[]=new int[msg.length()];
		char characters[]=new char[msg.length()];
		String msg2="";
		for(int i=0;i<msg.length();i++) {
			int value=msg.charAt(i);
			values[i]=value-32;
			characters[i]=(char)values[i];
			 msg2+=Character.toString(values[i]);
		
		}
		System.out.println("entered String is : "+ msg);
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(characters));
		System.out.println("converted String is : "+ msg2);
		
		
		System.out.println("--------------------- ");
		
		System.out.print("enter msg to convert  upperCase to LowerCase : ");
	    msg=scan.next();
	    
		   msg2="";
		   for(int i=0;i<msg.length();i++) {
			int value=msg.charAt(i);
			values[i]=value+32;
			characters[i]=(char)values[i];
			 msg2+=Character.toString(values[i]);
		
		   }
		  
			System.out.println("entered String is : "+ msg);
			System.out.println(Arrays.toString(values));
			System.out.println(Arrays.toString(characters));
			System.out.println("converted String is : "+ msg2);
		
		
		
		
	     
	
	
	
	}
}
