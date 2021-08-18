package comparatorInterFace;

import java.util.Scanner;
import java.util.TreeSet;

public class Student {
	
   int age;
   String Name;
   Double percentage ;   //or Double  Percentage=new Double();
   
   
    
   @Override
public String toString() {
	return "Student [age=" + age + ", Name=" + Name + ", Percentage=" + percentage + "]";
}



public Student(int age, String name, Double percentage) {
	super();
	this.age = age;
	Name = name;
	this.percentage = percentage;
}



public static void main(String[] args) {
	
	   Student s1=new Student(23,"B",65.6);
	   Student s2=new Student(21,"C",87.9);
	   Student s3=new Student(22,"A",45.7);
	   
	   SortStudentByName Name=new SortStudentByName();
	   SortStudentByAge age=new SortStudentByAge();
	   SortStudentByPercentage percentage=new SortStudentByPercentage();
	   
	   TreeSet<Student> ts=new TreeSet<Student>(age);//sorting by Name
	   
	   ts.add(s1);
	   ts.add(s2);
	   ts.add(s3);
	 
	   for(Student obj: ts)
		   System.out.println(obj);
	   
	    
	      
	 
	  
	   
}
}
