public class Student{
    int rno;
    String name;
    int mark;
    public Student(){
        rno = 0;
        name = null;
        mark = 0;
    }
    public Student(int rno,String name,int mark){
        this.rno = rno;
        this.name = name;
        this.mark = mark;
    }
    public void setMark(){
        mark = mark+mark/10;
    }
    public void print(){
        System.out.println(rno+" "+name+" "+mark);
    }
}