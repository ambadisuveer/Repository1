import java.util.ArrayList;
public class Driver1{
    public void display(Fruit[] fruits){
        for(int i=0; i<fruits.length; i++)
            System.out.println(fruits[i]);       
    }
    public static void main(String args[]){
        Fruit[] fruits = new Fruit[3];
        Fruit watermelon = new Fruit("Round","Green","watermelon");
        fruits[0] = new Fruit("Long","Yellow","Banana");
        fruits[1] = watermelon;
        fruits[2] = new Fruit("Round","Red","Apple");
        Driver1 driver = new Driver1();
        driver.display(fruits);
        ArrayList<Fruit> fruitList = new ArrayList<>(10);
        fruitList.add(watermelon);
        fruitList.add(new Fruit("Long","Yellow","Banana"));
        fruitList.add(new Fruit("Round","Red","Apple"));
        System.out.println(fruitList);
        
        fruitList.remove(2);
        System.out.println(fruitList);
        /*
        ArrayList<Integer> integerList = new ArrayList<>(10); Stores integers.
        integerList.add(10); Adds new element*/
    }
}