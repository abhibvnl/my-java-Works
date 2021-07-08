//key is Custom object
package D_mapInterFace.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class Student {
	String name;
	
	
  public Student(String name) {
		super();
		this.name = name;
	}

    @Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
  

public static void main(String[] args) {
	   
	Student s1=new Student("Tom");
	Student s2=new Student("Jery");
	Student s3=new Student("Jack");
	
	LinkedHashMap<Student, Integer> lhm= new LinkedHashMap<>();
	lhm.put(s1, 10);
	lhm.put(s2, 20);
	lhm.put(s3, 30);
	
	Set<Student> keys = lhm.keySet();// keys->s1,s2,s3
	
	for(Student key:keys)
		System.out.println( key +" value is "+lhm.get(key));
	   
}
}
