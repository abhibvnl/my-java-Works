package comparator;

import java.util.TreeSet;

public class student {
    int age;
    String name;
    
	public student(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		student s1=new student(21,"B");
		student s2=new student(23,"A");
		student s3=new student(22,"C");
		
		//sortStudentByAge  age=new sortStudentByAge();
		sortStudentByName  name=new sortStudentByName();
		TreeSet<student> ts=new TreeSet<student>(name);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(student s: ts)
		System.out.println(s);
		
	
	} 
}
