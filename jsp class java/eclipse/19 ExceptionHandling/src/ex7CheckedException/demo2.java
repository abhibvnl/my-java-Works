package ex7CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;



public class demo2 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		//FileReader f=new FileReader(notes.txt); //checked
		
		try {
			FileReader f=new FileReader(notes.txt);
		}
		catch(Exception e) {
			System.out.println("file not found");
		}
	
	}
}
