package q8;

import java.util.Scanner;

public class ex {
  public static void main(String[] args) {
	 
	 
	  Scanner scan=new Scanner(System.in);
	  
	  System.out.print("enter a String s1 : ");
	  String s1=scan.next(); 
	  System.out.print("enter a single char s2 : ");
	  char s2=scan.next().charAt(0);
	  
	  int cnt=0;
	  for(int i=0;i<s1.length();i++) { 
		 if(s1.charAt(i)==s2) 
			 break;
		
		     cnt++;
	  }
	  
	  for(int i=cnt;i<s1.length();i++)
		  System.out.print(s1.charAt(i));
		  
	  for(int i=0;i<cnt;i++)
		  System.out.print(s1.charAt(i));
	  
	 
} 
}
