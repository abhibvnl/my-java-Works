package pattern3;

public class pattern2 {

	public static void main(String[] args) {
		int rows=5;
		
		for(int i=rows ;i>=0; i--) {
			
			for(int j=0;j<i;j++) 
			System.out.print("* ");
			
			System.out.println();
		}
			
	}
}
