package questionSet1;


import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

//convert regular time to railway time
public class Q12 {
	
	public static String railwayTime(String s) {
		 String t = "";
		    try{
		       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
		       Date date = parseFormat.parse(s);
		       t=displayFormat.format(date);
		    }
		    catch(Exception e){
		System.out.println(e);        
		    }
		return t ;
		
	}
   public static void main(String[] args) {
	
	   Scanner scan= new Scanner(System.in);
	   System.out.print("Enter time : ");
	   String time=scan.next();
	   System.out.println(railwayTime(time));
	     
}
}
