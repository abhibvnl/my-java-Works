package comparator;

import java.util.Comparator;

public class sortStudentByAge implements Comparator<student> {

	
	@Override
	public int compare(student newObj,student oldObj) {
		return newObj.age-oldObj.age;
	}
}
