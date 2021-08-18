package questions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("enter array length : ");
		int len=scan.nextInt();
		int cnt=1;
		int myNumb[]=new int[len];
		
		for(int i=0;i<len;i++) {
		  System.out.println("enter "+ cnt++ +" element ");
		  myNumb[i]=scan.nextInt();
		}
		 
	 System.out.println(Arrays.toString(myNumb));
	 System.out.print("enter Calculatable output : ");
	 int op=scan.nextInt();
	 
	 cnt=0;
	 String finals[]=new String[len];  
	
	 for(int i=0;i<len;i++) 
		 for(int j=0;j<len;j++) {
		  if(myNumb[i]+myNumb[j]==op)	{
			  //System.out.println(myNumb[i]+" "+myNumb[j]);
			 finals[cnt]=myNumb[i]+" "+myNumb[j]; 
			 
			 cnt++;
		  }
	 }
	System.out.println(Arrays.toString(finals));
	
	 for(int i=0;i<finals.length/2;i++)
		 System.out.println(finals[i]);
	
	 }
}
