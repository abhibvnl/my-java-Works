package comparatorInterFace;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>{
	
	@Override
	public int compare(Student NewObj,Student PrevObj) {
		
		return NewObj.age-PrevObj.age;
	}

}
