class employee{

    String name;
    int id;
    double salary;

    employee(String n,int i,double s){
        name=n;
        id=i;
        salary=s;
    }

    void details(){
        System.out.println("name is "+name);
        System.out.println("id is "+id);
        System.out.println("salary is "+salary);
    }
}