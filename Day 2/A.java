public abstract class A{
    String hi;
    public A(){
        hi = "hiii";
    }
    public A(String hi){
        this.hi = hi;
    }
    abstract void saySomething();
    public void print(){
        System.out.println(hi);
    }
}