package Arrays;

public class Student {
  int age;
  String name;
public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "Student age is " + this.age + ", and name is " + this.name ;
}
  

public static void main(String[] args) {
	
	Student s1=new Student(21, "tom");
	Student s2=new Student(22, "jerry");
	Student s3=new Student(23, "jack");
	
	/*Student std[]=new Student[3];
	std[0]=s1;
	std[1]=s2;
	std[2]=s3;*/
	
	//or
	
	Student std[]= {s1,s2,s3};
	
	for(int i=0;i<std.length;i++) 
		System.out.println(std[i]);
}
}
