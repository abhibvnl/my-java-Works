
//Overriding toString
package toStringMethod;

public class exampleB {
     String name;
     
     public exampleB(String name) {
		this.name=name;
	}
     
     public String toString() {
		return this.name;
	}
     
	public static void main(String[] args) {
		
		exampleB e=new exampleB("abhi");
		
		System.out.println(e);      //from toString
		System.out.println(e.name);  //with objref
	}
}
