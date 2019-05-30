public class Sample1<T,G>{
    T variableT;
    G variableG;
    public Sample1(T variableT,G variableG){
        this.variableT = variableT;
        this.variableG = variableG;
    }
    public String toString(){
        return "First variable is "+variableT+" and Second variable is "+variableG;
    }
}