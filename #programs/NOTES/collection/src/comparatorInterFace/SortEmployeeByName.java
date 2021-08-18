package comparatorInterFace;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee>{
	
	@Override
	public int compare(Employee NewObj,Employee PrevObj) {
		
		return NewObj.name.compareTo(PrevObj.name);
	}

}
