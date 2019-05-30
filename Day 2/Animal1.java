public class Animal1{
    public static void main(String args[]){
        Animal wolf = new Animal();
        Animal tiger = new Animal("Roar",4);
        wolf.setlegs(4);
        wolf.setSays("Woo");
        System.out.println(tiger.getSays()+" "+tiger.getLegs());
        wolf.print();
        Lion obj = new Lion("Roar...!",4,true);
        obj.print();
        Animal lion1 = obj;
        lion1.print();//Still goes to Lion's print().Reverse is not possible.Lion->Animal.Animal->Lion not possible.
        System.out.println(lion1);
        System.out.println(obj);
        Jaguar obj1 = new Jaguar(1,"aaaa");
        obj1.setExtinct(true);
        obj1.print(obj1.getExtinct());
        System.out.println(obj1);
        obj1.print();

    } 
}