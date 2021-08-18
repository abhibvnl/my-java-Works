package SingleTon;



public class Adhar {
    
	private Adhar () {         //rule 1
		System.out.println("Adhar Id created");
	}
	

	
	public static void helperMethod() {  //rule 2
		if(ac==null)
			ac=new Adhar();     //rule 4
		else
			System.out.println("your Adhar already exist...");
			
	}
	
	 public static	Adhar ac=null;  //rule 3
	
	 public static void main(String[] args) {
		 
		Adhar.helperMethod(); //create obj 1st time
		Adhar.helperMethod();//cant create one more obj
		
	}
	
}

