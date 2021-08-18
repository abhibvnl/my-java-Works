package comparableInterFace;

import java.util.TreeSet;

public class employee implements Comparable<employee> {
	
	int age;
	
	public employee(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "employee [age=" + age + "]";
	}


	@Override
	
	public int compareTo (employee s) {
		return this.age-s.age;
	}
	
	public static void main(String[] args) {
		
		employee e1=new employee(23);
		employee e2=new employee(21);
		employee e3=new employee(22);
		
		TreeSet<employee> ts=new TreeSet<employee>(); //if u want custom obj sort,implement <<Comparable>>
		ts.add(e1);                                 //and  Override compareTo() method
		ts.add(e2);
		ts.add(e3);
		
		for(employee obj: ts)
			System.out.println(obj);
		
	}
}