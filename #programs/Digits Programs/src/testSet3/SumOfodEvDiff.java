package testSet3;

public class SumOfodEvDiff {
  static int  oddEvenDif( int arr[]) {
	  int odd=0,even=0;
	  for(int i : arr) {
		  if(i%2==0)
			  even+=i;
		  else
			  odd+=i;
	  }
	 return odd-even;
  } 
  public static void main(String[] args) {
	  
	  int arr[]= {10,11,7,12,14};
	  
	System.out.println(oddEvenDif(arr));
}
}
