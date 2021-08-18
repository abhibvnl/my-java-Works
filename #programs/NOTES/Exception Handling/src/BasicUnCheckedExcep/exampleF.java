//when we don't know excep name we can use superMost Class Exception e
//and there should be no executable line between  try and catch

package BasicUnCheckedExcep;

public class exampleF {
	
public static void main(String[] args) {
	 System.out.println("start");
	
	int a[]= {1,2,3} ;
	
	//System.out.println(a[100]);//exception @
	 
	 try {
		 System.out.println(a[100]);  //handling
	  } 
	 catch (Exception e) {  //when we dont know exception name
		System.out.println("invalid ind");
	}
	 System.out.println("end,below lines of code executed");
}
}
