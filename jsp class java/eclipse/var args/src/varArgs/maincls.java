package varArgs;



class calc{
	
void sum(int ... numbs) {
	int res=0;
	for(int i=0;i<numbs.length;i++) {
	res+= numbs[i];
		
	}
	
	System.out.println(res);
}
}
public class maincls {

	public static void main(String[] args) {
		
    calc obj=new calc();
    obj.sum (1,2,3);
	}

}
 