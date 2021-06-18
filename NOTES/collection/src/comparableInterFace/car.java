package comparableInterFace;

import java.util.ArrayList;
import java.util.Collections;

public class car implements Comparable<car> {
    //double cost;  with this Can't override compareTo,why bcoz its nly available in Wrapper class and String
	 Double cost;

@Override
public String toString() {
	return "car [cost=" + cost + "]";
}

public car(double cost) {
	
	this.cost = cost;
}

@Override
public int compareTo(car c) {
	return this.cost.compareTo(c.cost);
}
 

public static void main(String[] args) {
	car c1=new car(9045.56);
	car c2=new car(4645.68);
	car c3=new car(3935.97);
	
	
	ArrayList<car> al=new ArrayList<car>();
	al.add(c1);
	al.add(c2);
	al.add(c3);
	
	Collections.sort(al); //we have to ,for ArrayList /Linked list
	
	for(car c: al)
		System.out.println(c);
}
}
