package ex3;

 class Person {

	 String name;
	 int age;
	 char gender;
	 
	 Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	 
  }
 
class Student extends Person{
	 
	 int marks;
	 String col;
	 Student(String name, int age, char gender, int marks, String col) {
		super(name, age, gender);
		this.marks = marks;
		this.col = col;
	}
}
  
public class maincls{
	   
   
  public static void main(String [] args) {
	  
	  Student obj=new Student("abhi",23,'m',450,"pes");
	  
	  System.out.println(obj.name);
	 
	
  }
  
  }