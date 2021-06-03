package ex5;

class demo1{
	
	
	static {         
			System.out.println("running static ini... block ");
		}
	
	 {                                   
			System.out.println("running ins ini... block ");
		}	
	 
	 demo1(){
		 System.out.println("running ins constructor of demo1...  "); 
	 }
}

    class maincls2{
	public static void main(String[] args) {
		
		demo1 obj=new demo1();
	
	}
}