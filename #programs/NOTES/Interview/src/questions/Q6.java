package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
 
	public static void main(String[] args) {
	
	  Scanner scan=new Scanner(System.in);
	  System.out.print("Enter String : ");
	  String str=scan.nextLine();  //nextLine for considering spaces
	 
	  System.out.println("length of string is : "+str.length());
	   
	  int j=0;
	  int finals[]=new int[str.length()];
	  int cnt=1;
	  
	  for(int i=0 ; i<str.length(); i++) 
		  if(str.charAt(i)!=32) 
			finals[j]=cnt++;
		    else {
			  j++;
			  cnt=1;
		     }
	  
	   //System.out.println(Arrays.toString(finals));
	  for(int i=0;i<str.length();i++) {
		  if(finals[i]==0)  
			  break;
		  System.out.print(finals[i]+" ");
	  }
}
}
