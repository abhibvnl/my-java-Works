package downcast;

class demo1 {
	int x=10;
	void test(){
		System.out.println(" test() of demo1");
	}
}

class demo2 extends demo1 {
	int y=20;
	void disp(){
		System.out.println(" disp() of demo2");
	}
}
class demo3 extends demo1 {
	int z=30;
	void view(){
		System.out.println(" view() of demo3");
	}
}
public class maincls {

	public static void main(String[] args) {
		demo1 obj=new demo3();                      
		   System.out.println(obj.x);	          
    	   obj.test();
		
		    if(obj instanceof demo2)// always use instance of operator from revesre(last subcls to top supercls)
				{
		    	 demo2 obj2=(demo2)obj;
		    	System.out.println(obj2.y);	
		    	obj2.disp();
				}
			else if(obj instanceof demo3)
				{
				 demo3 obj3=(demo3)obj;
			    	System.out.println(obj3.z);	
			    	obj3.view();
				
				}
			
			
		 
	}
}


