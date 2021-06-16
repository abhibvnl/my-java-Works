//ArrayIndexOutOfBoundsException

package BasicUnCheckedExcep;

public class exampleB {
	
public static void main(String[] args) {
	 System.out.println("start");
	
	int a[]= {1,2,3} ;
	
	//System.out.println(a[100]);//exception @
	 
	 try {
		 System.out.println(a[100]);  //handling
	  } 
	 catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid ind");
	}
	 System.out.println("end,below lines of code executed");
}
}
