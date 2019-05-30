import java.util.Scanner;
public class name{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
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