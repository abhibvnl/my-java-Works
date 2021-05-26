//when each obj needs final value we go for final instance variable
//it must  be initiazed  from parameterized constrtr
class  sample{
    final int x;

    sample(int x){
      this.x=x;  //with parameterized constr we can do,only once
      
    }
}

class maicls{
    public static void main(String[] args) {
        sample obj1=new sample(12);
        System.out.println(obj1.x);

       // obj1.x=20;// this gives error  coz cannot assign a value to final variable x
       
        sample obj2=new sample(20);
        System.out.println(obj2.x); 
       
        // but we cannot re initialize 
    }
}