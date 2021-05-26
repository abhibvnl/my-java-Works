
//constr can be in maincls also

class maincls{
    int x=0;

    maincls(){
        x=10;
    }

    public static void main(String[] args) {
        maincls obj1=new maincls();  //creating obj and clling constructor @ a time
        System.out.println(obj1.x);
    }
}