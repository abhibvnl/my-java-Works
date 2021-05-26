package adharCard;

public class adhar {

	private adhar() {
		System.out.println("Udai is Generated");
	}
	
 private static	adhar p; //p=null
 
 public static void insOfPerson() {
	 if(p==null) 
		 p=new adhar();
 }
}
