package instanceOf3;


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
class demo3 extends demo2 {
	int z=30;
	void view(){
		System.out.println(" view() of demo3");
	}
}
public class maincls {

	public static void main(String[] args) {
		demo1 obj=new demo1();
		
		    if(obj instanceof demo1)// always use instance of operator from revesre(last subcls to top supercls)
				{
		    	System.out.println("objr is reffering to demo3 instance");	
				}
			else if(obj instanceof demo2)
				{
				System.out.println("objr is reffering to demo2 instance");
				}
			else if(obj instanceof demo3);
		    {
		    	System.out.println("objr is reffering to demo1 instance");
		    }
			
		 
	}
}


