package pack2;
import pack1.demo1;
public class demo3  {     //public class demo3 extends demo1 ,,now we can access var3 with inheritence or is a relationship

	public static void main(String[] args) {
		 // System.out.println(demo1.var1);  //error bcoz var1 is private ,access lvl is only within class,but its from another class
	    // System.out.println(demo1.var2);  // //error bcoz var2 is package ,access lvl is only within package,but its from another packge
      //.out.println(demo1.var3);  //// //error bcoz var3 is protected  ,access lvl is only within package,outside also but with is a relation(no is a here)
		 System.out.println(demo1.var4);
	}

}
