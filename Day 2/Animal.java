public class Animal{
    String says;
    int legs;
    public Animal(){    
        says = null;
        legs = 0;
    }
    public Animal(String says,int legs){//Constructor
        this.says = says;
        this.legs = legs;
    }
    public void setSays(String says){//Setters
        this.says = says;
    }
    public void setlegs(int legs){
        this.legs = legs;
    }
    public String getSays(){//Getters
        return says;
    }
    public int getLegs(){
        return legs;
    }
    public void print(){
       System.out.println(says+" "+legs);
    }
    public String toString(){
        return "I dont hunt";
    }
}