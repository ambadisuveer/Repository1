public class B extends A{
    public void saySomething(){
        System.out.println("Hello "+hi);
    }
    public static void main(String args[]){
    B a = new B();
    a.saySomething();
    a.print();
    }
}