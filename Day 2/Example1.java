public class Example1{
    public static void main(String args[]){
        Example.print();
        Example e = new Example();//Object needs to be created because sayHello is not static
        e.sayHello();;
    }
}