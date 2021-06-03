package upperCaseLowerCaseJsp2;

import java.util.Scanner;

public class upperLowerCase {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter msg to Convert Upper to lower Case : ");
		String msg=scan.next();
		System.out.println(msg.toLowerCase());
		
		System.out.println("--------------------");
	
		System.out.print("enter msg to Convert lower Case to Upper case : ");
		String msg2=scan.next();
		System.out.println(msg2.toUpperCase());
		
	}
}
