//Array list PDC,1.2,j.util
//ArrayList Ini cap=10
//inc cap=curr cap*3/2+1;
//
package listInterFace;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListClassA {
   
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		LinkedList ll=new LinkedList();
		ll.add(40);
		ll.add(50);
		
		al.add(10);
		al.add(20.7);
		al.add("java");
		al.add('C');
		al.add(10);                     //1
		 
		System.out.println(al);//implicitly override tostring
		
		al.addAll(ll);                    //2
		System.out.println(al);
		
		System.out.println(al.contains(100));   //3
		System.out.println(al.containsAll(ll)); //4
		
		System.out.println(al.indexOf(10));  //5
		System.out.println(al.lastIndexOf(10));  //6
		
		al.remove(4);                   //7
		System.out.println(al);
		
		al.removeAll(ll);                //8
		System.out.println(al);           
		
		 System.err.println(al.get(1));   //9
		System.out.println(al.size());    //10    
		
		System.out.println(al.isEmpty());  //11
		
		al.clear();                        //12
		
		System.out.println(al.isEmpty());  //11
		
		

		
		
}
}
