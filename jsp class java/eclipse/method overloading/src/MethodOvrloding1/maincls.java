package MethodOvrloding1;
 class demo{
void disp() {
	System.out.println("running non-parameterized disp method ");
}
 
 
 void disp(String s) {
		System.out.println("running parameterized disp method ");
	}
	 }
 
public class maincls {

	public static void main(String[] args) {
	demo obj=new demo();
	obj.disp();
	}

}
