package digits;

public class E_SmallestNo {

	public static void main(String[] args) {
		
		int myNumbs[]= {17,59,41,29,9,89,58,11};
		int sml=myNumbs[0];
		
		for(int j=0;j<myNumbs.length;j++) 
			if(sml<myNumbs[j]) 
		    sml=sml;	
			else
		    sml=myNumbs[j];
		
		
		 System.out.println("smallest number oin Array : "+ sml);
		
		
	}
}
