package ex3;



   class demo1{
	static int x;   
	 int y;
	
	static {            //static ini..bloks also excutes once when an obj created,,doent consider no of obj created,execures nly once
			System.out.println("running static ini... block ");
		}
	 {                 
		x=10;                                      
		y=30;    
		int y=20;                      
		System.out.println("running ins ini... block ");
	}
}

    class maincls{
	public static void main(String[] args) {
		
		demo1 obj=new demo1();
		System.out.println(demo1.x);
		System.out.println("y is "+obj.y); 
	}
}