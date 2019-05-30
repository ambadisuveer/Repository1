public class Car{
    int fuel;
    public Car(){
        fuel = 100;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public void go() throws OutOfFuelException{
        if(fuel>0)
            System.out.println("I am going at a speed of 160");
        else
            throw new OutOfFuelException();
    }
    public static void main(String args[]){
        Car car = new Car();
        try{
          car.go();
        }catch(Exception e){
             System.err.println(e);
        }
        car.setFuel(0);
        try{
            car.go();
        }catch(Exception e){
            System.err.println(e);
        }   
    }
}
