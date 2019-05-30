import java.util.Scanner;
import java.io.FileReader;
public class trial2{
    public static void main(String args[]){
        FileReader file = null;
        try{
            file = new FileReader("file2.txt");
        }catch(Exception e){
            System.out.println("File does not exist");
        }
        Scanner sc = new Scanner(file);
        int rno = sc.nextInt();
        String batch = sc.next();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("rno = "+rno+" batch = "+batch+" name = "+name);
    }
}    