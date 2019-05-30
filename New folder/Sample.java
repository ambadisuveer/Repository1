public class Sample<G>{
    G variable;
    public Sample(G variable){
        this.variable = variable;
    }
    public String toString(){
        return "The input is: "+variable;
    }
}