package practise2;

import java.util.Set;
import java.util.TreeSet;

public class studentComp implements Comparable<studentComp> {
  int age; 
  
  public studentComp(int age) {
	 this.age=age;
}
  
  @Override
  public int compareTo(studentComp s) {
	 return this.age-s.age;
  }
  @Override
  public String toString() {
	  
	  return ""+this.age;
  }
  
  public static void main(String[] args) {
	
	  studentComp s1=new studentComp(10);
	  studentComp s2=new studentComp(9);
	  studentComp s3=new studentComp(11);
	 
	  Set<studentComp> ts=new TreeSet<>();
	  ts.add(s1);
	  ts.add(s2);
	  ts.add(s3);
	  for(studentComp s : ts)
		  System.out.println(s);
	  
	  
}
}
