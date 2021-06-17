package listInterFace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Contructrs {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add(10);
		
		LinkedList ll=new LinkedList<>(al); //10 adds to ll
		ll.add(20);
		
		Vector v=new Vector<>(ll);         //10 20 adds to v
		v.add(30);
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
	}
}
