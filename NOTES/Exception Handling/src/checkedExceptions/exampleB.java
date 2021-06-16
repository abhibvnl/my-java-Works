package checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exampleB {

	public static void main(String[] args) {
	//FileReader f=new FileReader("notes.txt");	//immediate fix,known
		
	try {
		FileReader f=new FileReader("notes.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}
	
	
}
