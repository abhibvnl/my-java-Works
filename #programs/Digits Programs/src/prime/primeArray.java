package prime;

public class primeArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<a.length;i++) {
			
			boolean flag=false;
			 int m=a[i]/2;
			 if(a[i]==1||a[i]==0 )
				flag=true;
			 else 
			 {
				for(int j=2; j<=m; j++) {
					if(a[i]%j==0) {
					 flag=true;
					 break;
					}
				}
			 }
			     if(flag==false)
				 System.out.println(a[i]);
			}
		 
		 
		
	   }
	 }

	


