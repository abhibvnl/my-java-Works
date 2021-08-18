package testSet3;

public class TotalTax {
 static double  TotalTax(int arr[]) {
	  
	 boolean first=true;
	  double tax=0;
	
	 for(int i=0;i<arr.length;i++) {
		 if(first) {
			 tax+=0;
			 first=false;
		 }
		 else {
			 tax+=(arr[i]-arr[0])/10;
			 System.out.println(tax);
		 }
	 }
	 return tax;
 }  
 
 public static void main(String[] args) {
	int arr[]= {1000,2000,3000,4000,5000};
	System.out.println(TotalTax(arr));
}
}
