package digits;
import java.util.Scanner;
public class swapNo {
	
	
	    public static void main(String[] args) {
	        
	Scanner scanner1=new Scanner(System.in);

	System.out.print("enter no1 : ");
	int n1= scanner1.nextInt();

	System.out.print("enter no2 : ");
	int n2= scanner1.nextInt();
	int temp1=n2;
	    n2=n1;
	    n1=temp1;
	    System.out.println("n1: "+n1);
	    System.out.println("n2: "+n2);
	    }

	    


	}