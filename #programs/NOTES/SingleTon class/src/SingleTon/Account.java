package SingleTon;



public class Account {
    
	private Account () {         //rule 1
		System.out.println("Account created");
	}
	

	
	public static void helperMethod() {  //rule 2
		if(ac==null)
			ac=new Account();     //rule 4
		else
			System.out.println("Accout already exist");
			
	}
	
	 public static	Account ac=null;  //rule 3
	
	 public static void main(String[] args) {
		 
		Account.helperMethod(); //create obj 1st time
		Account.helperMethod();//cant create one more obj
		
	}
	
}

