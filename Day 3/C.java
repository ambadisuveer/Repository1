public abstract class C implements A,B{//abstract keyword is used to say that this class contains an abstract method.
    public void sayA(){
        System.out.println("A");
    }
    public void say(){
        System.out.println("say");
    }
    abstract public void sayB();
}