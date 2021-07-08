package q2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
	
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter Number of elemnts : ");
	  int size=scan.nextInt();
	  
	  int elements[]=new int[size];
	  int rst[]=new int[elements.length-1];
	  
	  int cnt=1;
	  for(int i=0;i<elements.length;i++) {
		  System.out.println("enter "+cnt+" elemnt");
		  int numb=scan.nextInt();
		  elements[i]=numb;
		  cnt++;
	  }
	  
	  System.out.println("------------------------");  
	  System.out.println(Arrays.toString(elements));
	
	   cnt=0;
	  for(int i=elements.length-2; i>=0;i--) {
		  if(i!=0) {
			 elements[i-1]=elements[i]+elements[i-1];
			 rst[cnt]=elements[i-1];
			 cnt++;
		  }
		  else 
			  rst[cnt]=elements[i]+elements[elements.length-1];
		  
			  
	  }
	  System.out.println(Arrays.toString(rst));
	  int finalRes=0;
	  for(int i:rst)
		 finalRes+=i;
	  System.out.println("------------------");
	  System.out.println("Total time required to assemble all parts : "+finalRes);
	  
}
}
