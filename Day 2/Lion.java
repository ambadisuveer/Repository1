public class Lion extends Animal{//Inherited class
    boolean hunt;
    public Lion(){
        this.says = null;
        this.legs = 0;
        this.hunt = false;
    }
    public Lion(String says,int legs,boolean hunt){
        this.says = says;
        this.legs = legs;
        this.hunt = hunt;
    }
    public void setHunt(boolean hunt){
        this.hunt = hunt;
    }
    public boolean getHunt(){
        return hunt;
    }
    public void print(){//Overriding
        if(hunt)
            System.out.println("I Hunt");
        else
            System.out.println("I dont Hunt");
    }
    public void print(boolean hunt){//Overloading
        if(hunt)
             System.out.println("I Hunt");
        else
             System.out.println("I dont Hunt");
    }
    public String toString(){
        if(hunt)
             return "I hunt";
        else
            return "I dont hunt";
    }
}
