public class Animalx{
    int legs;
    boolean prey;
    public Animalx(){
        this.legs = 0;
        this.prey = false;
    }
    public Animalx(int legs,boolean prey){
        this.legs = legs;
        this.prey = prey;
    }
    public int getLegs(){
        return legs;
    }
    public boolean getPrey(){
        return prey;
    }
    public void print(){
        System.out.println(legs+" "+prey);
    }
}