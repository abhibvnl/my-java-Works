package digits;

public class E_SmallestNo {

	public static void main(String[] args) {
		
		int myNumbs[]= {17,59,41,29,9,89,58,11};
		int sml=myNumbs[0];
		
		for(int i=0;i<myNumbs.length;i++) 
			if(myNumbs[i]<sml) 
		    sml=myNumbs[i];
		
		
		 System.out.println("smallest number oin Array : "+ sml);
		
		
	}
}
