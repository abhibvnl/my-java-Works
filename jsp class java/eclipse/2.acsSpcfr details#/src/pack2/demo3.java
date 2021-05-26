
package pack2;

import pack1.demo1;

public class demo3 {  //public class demo3 extends demo1 ,,now we can access var3 with inheritence or is a relationship
	demo1 d1=new demo1();
	void func1() {
		 // System.out.println(d1.var1);  //error bcoz var1 is private ,access lvl is only within class,but its from another class
	    // System.out.println(d1.var2);  // //error bcoz var2 is package ,access lvl is only within package,but its from another packge
      //System.out.println(d1.var3);  //// //error bcoz var3 is protected  ,access lvl is only within package,outside also but with is a relation(no is a here)
		 System.out.println(d1.var4);
	}

}
