package digits;

import java.util.Arrays;

public class asccending {
   public static void main(String[] args) {
	int a[]= {4,3,9,7,6,1,8};
	
	for(int i=0;i<a.length-1;i++)
		for(int j=0;j<a.length-1;j++)
			if(a[j]>a[j+1]) {
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
	System.out.println(Arrays.toString(a));
				
   }
}

