package ex7;


class demo1{
	int x=10;
	
	static {         
			System.out.println("running static ini... block2 ");
		}
	 
	 {       x=20;                            
		System.out.println("running ins ini... block1 ");
	 }
	 
	 demo1(){
		 x=100;
		 System.out.println("running ins constructor of demo1...  "); 
	    }

	 {       x=30;                            
		System.out.println("running ins ini... block2 ");
	 }
	 
	 
	 static {         
			System.out.println("running static ini... block1 ");
		}
	
	
}

    class maincls{
	public static void main(String[] args) {
		
		demo1 obj=new demo1();
		System.out.println(obj.x);
	
	}
}