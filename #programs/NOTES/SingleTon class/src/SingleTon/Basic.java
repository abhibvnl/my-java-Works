package SingleTon;



public class Basic {
    
	private Basic () {         //rule 1
		System.out.println("obj created");
	}
	

	
	public static void helperMethod() {  //rule 2
		if(ac==null)
			ac=new Basic();     //rule 4
		else
			System.out.println("obj already exist");
			
	}
	
	 public static	Basic ac=null;  //rule 3
	
	 public static void main(String[] args) {
		 
		Basic.helperMethod(); //create obj 1st time
		Basic.helperMethod();//cant create one more obj
		
	}
	
}

