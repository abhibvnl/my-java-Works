//value is customObject
package D_mapInterFace.TreeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Student  {
   
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		Student s1=new Student(23,"B");
		Student s2=new Student(22,"C");
		Student s3=new Student(21,"A");
		

		  TreeMap<Integer, Student > tm=new  TreeMap<>();
			
			tm.put(10,s1);
			tm.put(30,s2);
			tm.put(20,s3);
			
			Set<Integer> keys = tm.keySet();
			
			//using for loop
			for(int key: keys)
				System.out.println(key+" "+tm.get(key));
			
			System.out.println("--------------------");
			//using iterator
			        Iterator<Integer> itr = keys.iterator();
			          while(itr.hasNext()) {
			        	  int key=itr.next();
			        	  System.out.println(key+" "+tm.get(key));
			          
			          }
			        	  
			
			
	}
	
}
