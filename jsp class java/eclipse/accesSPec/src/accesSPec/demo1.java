package accesSPec;
                               
public class demo1 {
  
	void test() {
		int x=0;
	}
}
 class demo2 extends demo1{
	 
	 protected void test() {   //  we cannot use private or decrease access specifier after ovrriding a method
	                           //we can use protected or public
		 int x=01;
		 }
	 }
