//
package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  
	   System.out.print("enter S1 : ");
	   String s1=scan.next();
	   
	   System.out.print("enter S2 : ");
	   String s2=scan.next();
	   
	   System.out.print("enter the length : ");
	   int len=scan.nextInt();
	   
	   char similar[]=new char[s1.length()];
	   int cnt=0;
	   
	   for(int i=0;i<s1.length();i++)     
		   for (int j=0;j<s2.length();j++) {
			     if(s1.charAt(i)==s2.charAt(j)) {	
			    	 similar[cnt]=s1.charAt(i);
			    	 cnt++;   	
			  }
	     }
	   
	     String newString="";
	     for(int k=0;k<similar.length;k++) 
		   newString+=similar[k];  
	   
	   System.out.println(Arrays.toString(similar));	 
	
	   for(int i=0;i<len;i++)
	   System.out.print(newString.charAt(i));
	  
}
}
