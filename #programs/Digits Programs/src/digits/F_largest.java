package digits;

public class F_largest {

	public static void main(String[] args) {
		
		int myNumbs[]= {17,59,41,29,9,89,58,11};
		int large=myNumbs[0];
		
		for(int j=0;j<myNumbs.length;j++) 
			if(large>myNumbs[j]) 
		    large=large;	
			else
		    large=myNumbs[j];
		
		
		 System.out.println("largest number in Array : "+ large);
		
		
	}
}
