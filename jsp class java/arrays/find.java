// wap to search no in arrays found: its present in arrays otherwise : not present 

class fnd{
   public static void main(String[] args) {
        
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int expNum=11;
        boolean present=false;
       
        for(int i=0; i<numbers.length; i++)
        {
          if(numbers[i]==expNum)
          {
          present= true;
          break;
          }
         
        }
        
        if(present==true)
        System.out.println(expNum + " is present");
        else
        System.out.println(expNum + " is not present");
    }
}