package maxDiffrence;

import java.util.Scanner;

public class BetweenTwo {
	
	 static  int max=0;
	  static  int temp=0;
	  
	   
	    
	   static int max(int no1,int no2) {
	    int res=no1>no2 ? no1-no2: (no2-no1);
		 return res;
	    }

	           public static void main(String[] args) {
	      
	       
	            Scanner scan=new Scanner(System.in);
	             
                System.out.print("enter No1 : ");
                int no1=scan.nextInt();
                System.out.print("enter No2 : ");
                int no2=scan.nextInt();

	         
	              System.out.println(max(no1,no2));
	            }
	        }
