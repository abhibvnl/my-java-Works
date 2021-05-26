class cant{
    public static void main(String[] args) {
        
        int numbers[]={1,5,3,4,5,6,7,8,5,10};
        var value= 5;
        int cnt=0;
    
        for(int i=0; i<numbers.length;i++){

            if(numbers[i]==value)
             cnt++;
        }
         System.out.println(value +" is " + cnt+ " times repeated");
    }
}