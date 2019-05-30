public class Jaguar extends Animal{
    int no;
    String species;
    boolean extinct;
    public Jaguar(){
        species = null;
        no = 0;
    }
    public Jaguar(int no,String species){
        this.no = no;
        this.species = species;
    }
    public void setExtinct(boolean extinct){
        this.extinct = extinct;
    }
    public boolean getExtinct(){
        return extinct;
    }
    public void print(){
        System.out.println(no+" "+species+" "+extinct);
    }
    public void print(boolean extinct){
        if(extinct)
            System.out.println("This species is extinct");
        else
            System.out.println("This species is not extinct");

    }
    public String toString(){
        if(extinct)
            return "This species is extinct";
        else
            return "This species is not extinct";
    }
}