import java.util.Scanner;
import java.io.FileReader;
public class trial1{
    public static void main(String args[]){
        FileReader file = nulll;
        try{
            file = new FileReader("file1.txt");
        }
        catch(Exception e){
            System.out.println("File does not exist");
        }
        int sum=0,c=0;
        Scanner sc = new Scanner(file);
        while(sc.hasNextInt()){
            sum = sum+sc.nextInt();
            c++;
        }
        System.out.println("The sum is"+sum);
        System.out.println("The count is"+c);
     }
 }
