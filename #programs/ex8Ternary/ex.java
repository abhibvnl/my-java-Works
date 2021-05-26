class maincls1{
    public static void main(String[] args) {
        int a=1;
        int b=2;

      /*  if(a==b)                          //1
        System.out.println("eqaul");
        else
        System.out.println("not eqaul");*/

        System.out.println((a==b)?"equal":"not equal"); //2 used to avoid if else,and reduce code

    }
}

class maincls2{
    public static void main(String[] args) {
        
        boolean isElgible=false;
        int age=21;
        int myAge=23;

        if(myAge>age)
        isElgible=true;
        else
        isElgible=false;

        System.out.println((isElgible)?"yes":"no");
    }
}