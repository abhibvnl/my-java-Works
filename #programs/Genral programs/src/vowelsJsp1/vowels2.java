//program to find entered char is vowels or not
package vowelsJsp1;

import java.util.Scanner;
public class vowels2 {
 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char vowels[]={'a','e','i','o','u'};
		boolean flag=false;
		
		System.out.print("enter a char : ");
		char value=scan.next().toLowerCase().charAt(0);
		
		for (int i=0; i<vowels.length;i++)
		{
			if(vowels[i]==value) {
				flag=true;
				break;
			}
			else 
			flag=false;
			
		}
		
		String msg=(flag)?"its a vowel":"its not vowel";
		System.out.println(msg);
		
		
	}
}
