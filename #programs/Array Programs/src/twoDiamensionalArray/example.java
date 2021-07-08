//{
package twoDiamensionalArray;

public class example {
    public static void main(String[] args) {
		
    	int a[][]= {
    			      {1,4,6,9},                     //3*3 array //row*column  //1row 4 colm
                      {5,9,3,5},
                      {4,3,7}
                    };
    	
    	System.out.println(a[0][3]);      // accessing 0th row and 3rd column element
    	System.out.println(a.length);     //row length
    	System.out.println(a[0].length);  //1st row column length
    	System.out.println(a[1].length);  //2nd row column length
    	System.out.println(a[2].length);  //3rd row column length
    	
    	
}
	}

