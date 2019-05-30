import java.util.Scanner;
import java.io.FileReader;
public class FileTest{
    public static void main(String args[]){
            FileReader file = null;
            try{
                file = new FileReader("file2.txt");
            }catch(Exception e){
                System.out.println("File does not exist");
            }
            Scanner sc = new Scanner(file);
             int rno = sc.nextInt();
             String batch = sc.next();//next will skip the next character
             sc.nextLine();//nextLine will skip the next new line character
             String name = sc.nextLine();
                String college = sc.nextLine();
              System.out.println(rno);
              System.out.println(batch);
             System.out.println(name);
             System.out.println(college);
     }
}