package pack1;

public class demo2 {

	demo1 d1=new demo1();
	void func1() {
		// System.out.println(d1.var1);  //error bcoz var1 is private ,access lvl is only within class,but its from another class
		   System.out.println(d1.var2);
		   System.out.println(d1.var3);
		   System.out.println(d1.var4);
	}
}
