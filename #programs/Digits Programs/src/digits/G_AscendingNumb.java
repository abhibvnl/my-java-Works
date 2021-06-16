package digits;

import java.util.Arrays;

  public class G_AscendingNumb {

	public static void main(String[] args) {
		
		int myNumbs[]= {1,7,5,8,6,3,9,2,4,10};
		int temp=0;
		
		for(int i=0;i<myNumbs.length-1;i++)
			for(int j=0;j<myNumbs.length-i-1;j++) 
				
				if(myNumbs[j]>myNumbs[j+1]) {
					temp=myNumbs[j+1];
					myNumbs[j+1]=myNumbs[j];
					myNumbs[j]=temp;
			 }
		
		System.out.println(Arrays.toString(myNumbs));
			 
	}
}
