class rect{
    double len;
    double width;
   

    rect(double len,double width){
        this.len=len;
        this.width=width;
        
    }

        void area(){
        double area=len*width;
        System.out.println("\narea of rectngle is : "+area);
        }

        void perimeter(){
        double per=2*len+2*width;
        System.out.println("\narea of perimeter is : "+per);
        }

        void diagnal(){
            double temp=len*len+width*width;
            temp=temp/2;
        double diagnal=(temp+1)/2;
        System.out.println("\narea of diagnal is : "+diagnal);
        }
    }