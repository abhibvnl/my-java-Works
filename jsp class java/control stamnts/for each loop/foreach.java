class fruits{
    public static void main(String[] args) {
        
        int numbers[]={1,2,3,4};
        String fruits[]={"apple","graphes","banana"};

        for (String fruit: fruits)   //we cant modify this for each loop
        System.out.println(fruit);   //u can have multiple statements
        

        for (int num: numbers)
        System.out.println(num);

        
    }
}