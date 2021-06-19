package D_mapInterFace;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClassB implements Comparable<TreeMapClassB> {
   
	int age;
	String name;
	
	public TreeMapClassB(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "TreeMapClassB [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(TreeMapClassB t) {
		return this.age-t.age;
	}
	
	public static void main(String[] args) {
		
		TreeMapClassB s1=new TreeMapClassB(23,"B");
		TreeMapClassB s2=new TreeMapClassB(22,"C");
		TreeMapClassB s3=new TreeMapClassB(21,"A");
		

		  TreeMap<Integer, TreeMapClassB > tm=new  TreeMap<>();
			
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
