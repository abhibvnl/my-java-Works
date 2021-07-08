package compareToMethod;

import java.util.TreeSet;

import comparableInterFace.student;

public class Student implements Comparable<Student>
{
	String name;
	int age;  
	Double percentage;   //if double can't compare with compareTo();
	
  
    
	public Student(String name, int age, Double percentage) {
		super();
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}


	@Override
	public int compareTo(Student s) {
		//return this.name.compareTo(s.name);
		//return this.age-this.age
		return this.percentage.compareTo(s.percentage);
	}




	public static void main(String[] args) {
		 
		Student s1=new Student("B",22,75.69);
		Student s2=new Student("A",21,68.45);
		Student s3=new Student("C",23,87.71);
		
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student obj:ts)
			System.out.println(obj);

		
	}
}
