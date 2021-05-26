package ex1Static;



class demo1{
	static int x;
	static int y;
	static {
		x=10;  //initializing member var x=10;                                            
		//y=30;    // int y=20;
		int y=20; //y=30;  (output is 0)                     //y is local var of static ini block//we cant access outside this block
		System.out.println("running static ini block ");
	}
}

class mainclass{
	public static void main(String[] args) {
		System.out.println("x is "+demo1.x);  //x=10;
		
		demo1 obj=new demo1();
		System.out.println("y is "+demo1.y); //y=30
	}
}