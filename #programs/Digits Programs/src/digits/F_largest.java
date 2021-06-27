package digits;

public class F_largest {

	public static void main(String[] args) {
		
		int myNumbs[]= {17,59,41,29,9,89,58,11};
		int large=myNumbs[0];
		
		for(int i=0;i<myNumbs.length;i++) 
			if(myNumbs[i]>large) 
			    large=myNumbs[i];
		
		
		 System.out.println("largest number in Array : "+ large);
		
		
	}
}
