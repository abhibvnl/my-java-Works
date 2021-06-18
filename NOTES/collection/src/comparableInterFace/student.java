package comparableInterFace;

import java.util.TreeSet;

public class student implements Comparable<student> {
	
	String name;
	
	public student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	

	@Override
	
	public int compareTo (student s) {
		return this.name.compareTo(s.name);
	}
	
	public static void main(String[] args) {
		
		student s1=new student("B");
		student s2=new student("C");
		student s3=new student("A");
		
		TreeSet<student> ts=new TreeSet<student>(); //if u want custom obj sort,implement <<Comparable>>
		ts.add(s1);                                 //and  Override compareTo() method
		ts.add(s2);
		ts.add(s3);
		
		for(student obj: ts)
			System.out.println(obj);
		
	}
}