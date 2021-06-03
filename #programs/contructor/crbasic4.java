class cr4{

    cr4(){        // // then from here
        System.out.println("contrt");
        radius=100;   
        System.out.println("non declred radius is "+radius);
    }

        int radius=10;  //1st execution from here ,so in cr4 the radius is declared from here
    {                   //then from here
        
        System.out.println("iniatize"+radius);   
        radius=20;
        System.out.println(radius);   
    }
}

class maincls{
    public static void main(String[] args) {
        
         cr4 r=new cr4();
    }
}