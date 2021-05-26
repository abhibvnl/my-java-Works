package calc;

public class operation implements cal {

	   @Override
	   public  int add(int no1,int no2)
	     {
		   return no1+no2;
	      }
		
		@Override
	   public   int sub(int no1,int no2)
	   {
	    	 return no1-no2;
	    }
		
		@Override
	   public  double div(int no1,int no2)
		{
	    	 return no1/no2;
	    }
		
		@Override
	   public int mul(int no1,int no2)
		{
	    	return no1*no2;
	    }
}
