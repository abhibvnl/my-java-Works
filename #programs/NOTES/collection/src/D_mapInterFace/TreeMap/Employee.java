//key is customObject
package D_mapInterFace.TreeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Employee implements Comparable<Employee> {
   
	int age;
	String name;
	
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Employee t) {  //sort by age
		return this.age-t.age;
	}
	
	public static void main(String[] args) {
		
		Employee s1=new Employee(22,"B");
		Employee s2=new Employee(21,"C");
		Employee s3=new Employee(23,"A");
		

		  TreeMap<Employee, Integer > tm=new  TreeMap<>();
			
			tm.put(s1,10);
			tm.put(s2,20);
			tm.put(s3,30);
			
			Set<Employee> keys = tm.keySet();
			
			//using for loop
			for(Employee key: keys)
				System.out.println(key+" "+tm.get(key));
			
			System.out.println("--------------------");
			//using iterator
			        Iterator<Employee> itr = keys.iterator();
			          while(itr.hasNext()) {
			        	  Employee key=itr.next();
			        	  System.out.println(key+" "+tm.get(key));
			          
			          }
			
			        	  
			
			
	}
	
}
