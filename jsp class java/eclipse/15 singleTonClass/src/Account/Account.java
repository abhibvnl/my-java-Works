package Account;

public class Account {
 
    //rule 1
    private Account() {                  //to restricts object creation in other class
	  System.out.println("Account created in SBI ");
      }
    
   //rule 3 
   private static Account objRef;
   
 //rule 2
   public static void instanceOfAcc() {
	   if( objRef==null)
		objRef=new Account();
	   else
		 System.out.println("Account already created in SBI");
   
 }
}
