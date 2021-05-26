package ex2instance;


class demo1{
	 int x;   
	 int y;
	 {                      //        instance blocks are executes whenevrer we created obj
		x=10;  //initializing ins member var x=10;                                            
		y=30;    // 
		int y=20;                       //y is local var of instance ini block//we cant access outside this block
		System.out.println("running static ini block ");
	}
}

class maincls{
	public static void main(String[] args) {
		demo1 obj=new demo1();
		System.out.println("x is "+obj.x);  //x=10;
		System.out.println("y is "+obj.y); //y=30
	}
}