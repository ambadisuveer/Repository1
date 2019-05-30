import java.util.Scanner;
public class Carx{
    public static void Fuel(int f) throws OutOfFuelExceptionx{
        if(f>0)
            System.out.println("Continue your drive");
        else
            throw new OutOfFuelExceptionx();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel level");
        int f = sc.nextInt();
        try{
            Fuel(f);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}