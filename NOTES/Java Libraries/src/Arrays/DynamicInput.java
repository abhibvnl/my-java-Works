package Arrays;

import java.util.Scanner;

public class DynamicInput {
     
	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter no of Elements : ");
		int size=scan.nextInt();
		
		int a[]=new int[size];
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter "+ (i+1) +"th element");
			a[i]=scan.nextInt();
		}
		
		
		System.err.print("u entered : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
}
