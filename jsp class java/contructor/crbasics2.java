class cr2{

   
    {
        System.out.println("i am initializer,i wll come whenevr use my cls name,while creating obj,i maincls,");
        System.out.println("and i wll execute 1st before cnonstr body");
    }
    cr2(){
        
        
        System.out.println(" const1");
    }

}

class maincls{
    public static void main(String[] args) {
        cr2 obj1=new cr2();
        cr2 obj2=new cr2();

    }
}