public class in implements in1{
    public void gMorning(){
        System.out.println("Good Morning");
    }
    public void say(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        in i = new in();
        i.say("hello");
        i.gMorning();
    }
}