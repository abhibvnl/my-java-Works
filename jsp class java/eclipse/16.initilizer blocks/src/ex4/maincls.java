package ex4;


//if class contains ins,static bloks,and constructor, exexcutes 1st statc block, 2nd instance,3rd contrctr //doent matter wr u position of those

class demo1{
	
	 {                                   
		System.out.println("running ins ini... block ");
	}
	 static {         
			System.out.println("running static ini... block ");
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