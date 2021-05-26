class sample{
    int x;    //int x=20;its better for this no need of cinstructr 

    sample(){
      x=20; // only non paramtrized-contructor originally replaces or re-initilize  instance var 
     }
// above constructr not usefull why bcoz we can directly initialize ins variable doing x=20 in
//in constrtr

//paramter constrr are very usefull than non paramter consructer

}

class maincls{
    public static void main(String[] args) {
    
        sample obj1=new sample();
        System.out.println(obj1.x);  //prints 20
        sample obj2=new sample();
        System.out.println(obj2.x);  //prints 20
}
}