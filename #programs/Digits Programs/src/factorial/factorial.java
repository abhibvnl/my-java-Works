package factorial;

//find factorial of number
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	
	System.out.print("Enter No to find factorial : ");
	int numb=scan.nextInt();
	int factRes=1;
	for(int i=numb; i>0;i--) {
		 factRes*=i;
	}
	
	System.out.println("Fctorial of "+numb+" is "+factRes);
	}

}
