//char equls test
class maincls{
    public static void main(String[] args) {
        char c1='a';
        char c2='a';

        if(c1==c2)            //(c1.equals(c2))----no support to char,thats only for strng
        System.out.println("equl");
        else
        System.out.println("no equl");
        
    }
}