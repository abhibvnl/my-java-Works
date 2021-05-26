import java.util.Date; //for date

class p2 {  //class is container of 1 or more related  functions
    public static void main( String[] args) //its also a 1 function
    {
      var  name="abhi";
      String name2="banu";
      var age=20; 
      int age2=22;
      final var name3="prem"; // u cannot change var value in future,,due yo final
      final var age3 =23;    //  u cannot change var value in future,,due to final
      System.out.println(name +" " +age +" "+name2+ " "+age2 +" "+ name3+" "+age3);

      //reference types//non- premative

       Date now= new Date();  //to get date aand time,,import package to work
        System.out.println("date and time is : " +now);

        int age4; //we cant initialise like this for word "var"
        age4=5;
        System.out.println(age4);

       // var age5 ;
        //age5=20; this will give error as:cannot use'var' on variable without initializer
        
        var age6=25; //we can use 'var' like this only
        System.out.println(age6); 
        
     
        
    }
}