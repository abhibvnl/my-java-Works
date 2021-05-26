package ex8;



class demo1{
	
	
	static {         
			System.out.println("running static ini... block1 ");
		}
	 
	
	 
	 
	 static {         
			System.out.println("running static ini... block2 ");
		}
	 
	
	
}

    class maincls{
	public static void main(String[] args) {
			
		demo1 obj=new demo1();
		
	
	}
}