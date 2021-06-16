package equalsMethod;

import hashCodeMethod.exampleB;

public class exampleA {
     
	public static void main(String[] args) {
		
		exampleA e1=new exampleA();
		exampleA e2=new exampleA();
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.equals(e2));
	}
}
