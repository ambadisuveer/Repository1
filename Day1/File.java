import java.util.Scanner;
import java.io.FileReader;
public class File{
    public static void main(String args[]){
            FileReader file = null;
            try{
                file = new FileReader("file1.txt");
            }catch(Exception e){
                System.out.println("File does not exist");
            }
            Scanner sc = new Scanner(file);
            int sum=0,c=0;
            while(sc.hasNextInt()){
                sum=sum+sc.nextInt();
                c++;
            }
            System.out.println("The number of numbers is "+c);
            System.out.println("The sum is "+sum);
            System.out.println("The average is "+sum/c);
    }
}