//when each obj needs final value we go for final instance variable
//it must  be initiazed  from parameterized constrtr
class  sample{
    final int id;

    sample(int id){
      this.id=id;  
      
    }
}

class maicls{
    public static void main(String[] args) {
        sample obj1=new sample(1212);
        System.out.println(obj1.id);

        sample obj2=new sample(2045);
        System.out.println(obj2.id); 
       
       }
}