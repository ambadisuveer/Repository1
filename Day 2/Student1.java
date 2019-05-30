public class Student1{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student(1,"abcd",55);
        s2.setMark();
        s1.print();
        s2.print();
    }
}