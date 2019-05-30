public class number{
    public static void main(String args[]){
        double n = 1.30;//Decimal numbers are double by default
        float fn = (float)n;//Type Casting
        int intn = (int)n;
        System.out.println(fn);
        System.out.println(n);
        if(fn>0)
            System.out.println("Positive");
        else if(fn<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        switch(fn){
            case 1.3:System.out.println("The number is 1");
                break;
            case 2.6:System.out.println("The number is 2");
                break;
        }
    }
}