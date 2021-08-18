package comparatorInterFace;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee>{
	
	@Override
	public int compare(Employee NewObj,Employee PrevObj) {
		
		return NewObj.id-PrevObj.id;
	}

}
