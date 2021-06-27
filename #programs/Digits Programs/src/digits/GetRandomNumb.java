//program to get random numb
package digits;

public class GetRandomNumb{
    public static void main(String[] args) {
        
        int Rndm=(int)(Math.random()*100);    //genertes random no between 100
                                             //random method returns double value so,
                                            //explicitly converting double to int using (int)
       // System.out.println("random Numb is :"+ Rndm);
        System.out.println((int)(Math.random()*100));
        }
    }