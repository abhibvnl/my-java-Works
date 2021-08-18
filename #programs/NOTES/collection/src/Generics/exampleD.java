//custom obj Generics
package Generics;

import java.util.ArrayList;

public class exampleD {
    
	String name;
	int age;
	
	public exampleD(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "exampleD [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
		exampleD e1=new exampleD("tom", 25);
		exampleD e2=new exampleD("jerry", 24);
		exampleD e3=new exampleD("bheema", 20);
		
		ArrayList<exampleD> al=new ArrayList<exampleD>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(exampleD obj: al) 
		System.out.println(obj);
	}
}
