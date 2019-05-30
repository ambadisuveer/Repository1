import java.util.ArrayList;
import java.util.Scanner;
public class StudentDetails{
    int rno;
    String name;
    String s_class;
    int age;
    public StudentDetails(){
        this.rno = 0;
        this.name = null;
        this.s_class = null;
        this.age = 0;
    }
    public void set(int rno,String name,String s_class,int age){
        this.rno = rno;
        this.name = name;
        this.s_class = s_class;  
        this.age = age;
    }
    public void print(){
        if(this.age>=18)
            System.out.println(S.get(i));
    }
    public void check(int rno,String name,String s_class,int age) throws UnderAgeException{
        if(age>=18)
            set(rno,name,s_class,age);
        else{
            throw new UnderAgeException();
        }
    }
    public static void main(String args[]){
        int rno,age,i = 0,n;
        String name,s_class;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        ArrayList<StudentDetails> S = new ArrayList<>();
        System.out.println("Enter rollno,name,class and age");
        while(i<n){
            S.add(new StudentDetails());
            rno = sc.nextInt();
            name = sc.next();
            s_class = sc.next();
            age = sc.nextInt();
            try{
                S.get(i).check(rno,name,s_class,age);
            }catch(Exception e){
                System.err.println(e);
            }
            i++;
        }
        i = 0;
        System.out.println("The details of student are");
        while(i<n)
            S.get(i).print();
    }
}